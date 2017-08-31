package sk.maha.windowbutton;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MenuButtonDemo {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			JFrame frame = new MenuButton();
			frame.setTitle("Menu Button");
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}
