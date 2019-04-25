package ihm;

import ihm.MainWindow;

/**
 * Class to start the game
 * 
 * @author Quentin Liguori
 *
 */
public class StartGame {

	public static void main(String[] args) {
		
		MainWindow window = new MainWindow();
		Thread guiTread = new Thread(window);
		guiTread.start();
	}
}
