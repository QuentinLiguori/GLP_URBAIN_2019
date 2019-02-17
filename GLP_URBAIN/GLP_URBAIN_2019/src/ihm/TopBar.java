package ihm;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import chrono.Chronometer;
import chrono.CyclicCounter;

public class TopBar implements Runnable {
    private Chronometer chronometer = new Chronometer();
    
    private static final int CHRONO_SPEED = 1000;
    private boolean stop = true;
    private TopBar instance = this;
    
    private JButton startButton = new JButton(" Start ");
    private JButton accelerateButton = new JButton(" Accelerate ");


	private JLabel hourLabel = new JLabel("Hour:");
    private JLabel minuteLabel = new JLabel("Minute:");
    private JLabel secondLabel = new JLabel("Second:");

    private JLabel hourValue = new JLabel("");
    private JLabel minuteValue = new JLabel("");
    private JLabel secondValue = new JLabel("");
	
	private JPanel topBarPane = new JPanel();
	
	public JPanel getTopBarPane() {
		
		return topBarPane;
	}
    public TopBar() {
        updateValues();

        topBarPane.setLayout(new FlowLayout(FlowLayout.CENTER));
        topBarPane.add(hourLabel);
        topBarPane.add(hourValue);

        topBarPane.add(minuteLabel);
        topBarPane.add(minuteValue);

        topBarPane.add(secondLabel);
        topBarPane.add(secondValue);
        
        startButton.addActionListener(new StartStopAction());
        topBarPane.add(startButton);
        
        

       // topBarPane.add(BorderLayout.NORTH, topBarPane);
    }

    private void updateValues() {
        // This part is for textual time printing.
        CyclicCounter hour = chronometer.getHour();
        hourValue.setText(hour.toString() + " ");

        CyclicCounter minute = chronometer.getMinute();
        minuteValue.setText(minute.toString() + " ");

        CyclicCounter second = chronometer.getSecond();
        secondValue.setText(second.toString() + " ");
	}
	@Override
	public void run() {
	    while (!stop) {
            try {
                Thread.sleep(CHRONO_SPEED);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            if(!stop) {
            	chronometer.increment();
            	updateValues();
            }
        }		
	}
	private class StartStopAction implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            if (!stop) {
	                stop = true;
	                startButton.setText(" Start ");
	            } else {
	                stop = false;
	                startButton.setText(" Pause ");
	                Thread chronoThread = new Thread(instance);
	                chronoThread.start();
	            }
	        }
	    }
}
