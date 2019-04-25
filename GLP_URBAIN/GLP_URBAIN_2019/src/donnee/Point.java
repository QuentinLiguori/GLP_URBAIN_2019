package donnee;

/**
 * @author Quentin Liguori
 * 
 * This class is a point who have to coordinates
 */


public class Point {
	
	private int x;
	private int y;
	
	/**
	 * Constructor of the Point
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	/**
	 * @return X
	 */
	public int getX() {
		return x;
	}
	/**
	 * 
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * 
	 * @return Y
	 */
	public int getY() {
		return y;
	}
	/**
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
}
