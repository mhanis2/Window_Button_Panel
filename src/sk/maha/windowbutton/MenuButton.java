package sk.maha.windowbutton;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuButton extends JFrame {

	private static final long serialVersionUID = -7906801561292231987L;

	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;

	public MenuButton() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		createMenuBar();
	}


	/**
	 * Create Menu Bar of window with exit button for closing window.
	 */
	public void createMenuBar() {
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("Menu");

		JMenuItem menuItem = new JMenuItem("Exit");
		menuItem.setToolTipText("Exit");
		menuItem.addActionListener(hocico -> {
			System.exit(0);
		});
		menu.add(menuItem);
		menubar.add(menu);
		setJMenuBar(menubar);
	}
}
