package ihm;

import javax.swing.JLabel;
import javax.swing.JPanel;

import chrono.Chronometer;
import chrono.CyclicCounter;

/**
 * Class who initialize the top part of the graphic interface of the game 
 * 
 * @author Quentin Liguori
 *
 */
public class TopBar extends Thread{
	
	public JPanel topBarPane = new JPanel();	
	public JLabel pointLabel1 = new JLabel(":");
    public JLabel pointLabel2 = new JLabel(":");
    
    public JLabel dayValue = new JLabel("Monday");
    public JLabel hourValue = new JLabel("00");
    public JLabel minuteValue = new JLabel("00");
    public JLabel secondValue = new JLabel("00");
    
    public Chronometer chronometer = new Chronometer();
    public static final int CHRONO_SPEED = 1000;
    public boolean stop = false;
	public String[] listday = {"Monday", "Thursday", "Wednesday", "Tuesday", "Friday", "Saturday", "Sunday"};
	
	public JPanel getTopBarPane() {		
		return topBarPane;
	}
	
	/**
	 * Constructor of TopBar
	 * 
	 * @see JPanel#add(java.awt.Component)
	 */
	public TopBar() {	
		
	    topBarPane.add(dayValue);
	    topBarPane.add(hourValue);

	    topBarPane.add(pointLabel1);
	    topBarPane.add(minuteValue);

	    topBarPane.add(pointLabel2);
	    topBarPane.add(secondValue);		
	}
	
	/**
	 * Update the value of the chronometer in the graphic interface
	 * 
	 * @see Chronometer#getDay()
	 * @see JLabel#setText(String)
	 * @see CyclicCounter#getValue()
	 * @see CyclicCounter#toString()
	 */
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
	
	/**
	 * Run the clock
	 * 
	 * @see Thread#sleep(long)
	 * @see Chronometer#increment()
	 * @see TopBar#updateValues()
	 */
	public void run() {
		while (!stop) {
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
	}
}