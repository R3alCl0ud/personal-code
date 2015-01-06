package Window;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class window extends JPanel{

	public static void CreateAndShowGUI() {
		JFrame Window = new JFrame("This is a window");
		Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel Hello = new JLabel("Hows this for a label name \nHello World");
		Hello.setPreferredSize(new Dimension(1280, 720));
		Window.getContentPane().add(Hello, BorderLayout.CENTER);

		Window.pack();
		Window.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CreateAndShowGUI();
			}
		});

	}

}