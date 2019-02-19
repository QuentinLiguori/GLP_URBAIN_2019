package ihm;

import ihm.MainWindow;

public class StartGame {

	public static void main(String[] args) {
		MainWindow window = new MainWindow();
		Thread guiTread = new Thread(window);
		guiTread.start();
			}
}
