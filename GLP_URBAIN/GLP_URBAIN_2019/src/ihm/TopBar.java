package ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import chrono.Chronometer;
import chrono.CyclicCounter;

public class TopBar extends Thread{
	
	public JPanel topBarPane = new JPanel();	
	public JLabel pointLabel1 = new JLabel(":");
    public JLabel pointLabel2 = new JLabel(":");
    
    public JLabel dayValue = new JLabel("Monday");
    public JLabel hourValue = new JLabel("00");
    public JLabel minuteValue = new JLabel("00");
    public JLabel secondValue = new JLabel("00");
    
    public JButton acceleratetime = new JButton("Accelerate");
    public JButton deceleratetime = new JButton("Decelerate");
    
    public Chronometer chronometer = new Chronometer();
    public boolean stop = false;
	public String[] listday = {"Monday", "Thursday", "Wednesday", "Tuesday", "Friday", "Saturday", "Sunday"};
	
	public JPanel getTopBarPane() {		
		return topBarPane;
	}
	public TopBar() {	
		
	    topBarPane.add(dayValue);
	    topBarPane.add(hourValue);

	    topBarPane.add(pointLabel1);
	    topBarPane.add(minuteValue);

	    topBarPane.add(pointLabel2);
	    topBarPane.add(secondValue);
	    
	    deceleratetime.addActionListener(new Decelerate());
	    topBarPane.add(deceleratetime);
	    acceleratetime.addActionListener(new Accelerate());
	    topBarPane.add(acceleratetime);
	}
	private void updateValues() {
        // This part is for textual time printing.
		CyclicCounter day = chronometer.getDay();
        dayValue.setText(listday[day.getValue()] + " ");
        
        CyclicCounter hour = chronometer.getHour();
        hourValue.setText(hour.toString() + " ");

        CyclicCounter minute = chronometer.getMinute();
        minuteValue.setText(minute.toString() + " ");

        CyclicCounter second = chronometer.getSecond();
        secondValue.setText(second.toString() + "");
    }
	 @Override
	    public void run() {
	        while (!stop) {
	        	if(MainWindow.gameStart == true) {
	        		try {
	                	Thread.sleep(SimuPara.SIMULATION_SPEED);
	            	} catch (InterruptedException e) {
	                	System.out.println(e.getMessage());
	            	}
	            	if(!stop) {
	            		chronometer.increment();
	            		updateValues();
	            	}
	        	}
	        	else {
	        		updateValues();
	        	}
	        }
	    }
		private class Decelerate implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(SimuPara.SIMULATION_SPEED == 1) {
					SimuPara.SIMULATION_SPEED = 10;
					deceleratetime.setText("Decelerate x10");
					acceleratetime.setText("Accelerate");
				}
				else if(SimuPara.SIMULATION_SPEED == 10) {
					SimuPara.SIMULATION_SPEED = 100;
					deceleratetime.setText("Decelerate x100");
					acceleratetime.setText("Accelerate");
				}
				else if(SimuPara.SIMULATION_SPEED == 100) {
					SimuPara.SIMULATION_SPEED = 1000;
					deceleratetime.setText("Decelerate");
					acceleratetime.setText("Accelerate");
				}
			}

		}
		private class Accelerate implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(SimuPara.SIMULATION_SPEED == 1000) {
					SimuPara.SIMULATION_SPEED = 100;
					acceleratetime.setText("Accelerate x10");
					deceleratetime.setText("Decelerate");
				}
				else if(SimuPara.SIMULATION_SPEED == 100) {
					SimuPara.SIMULATION_SPEED = 10;
					acceleratetime.setText("Accelerate x100");
					deceleratetime.setText("Decelerate");
				}
				else if(SimuPara.SIMULATION_SPEED == 10) {
					SimuPara.SIMULATION_SPEED = 1;
					acceleratetime.setText("Accelerate MAX");
					deceleratetime.setText("Decelerate");
				}				
			}

		}
}