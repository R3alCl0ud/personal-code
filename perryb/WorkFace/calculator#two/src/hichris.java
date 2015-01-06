import java.awt.*;

import javax.swing.*;


public class hichris extends JFrame{

	public static void createandshowgui() {
		JFrame hi = new JFrame("The Window");
		hi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("this is a label");
		label.setPreferredSize(new Dimension(700, 450));
		hi.getContentPane().add(label, BorderLayout.CENTER);
		
		hi.pack();
		hi.setVisible(true);
	}
		public static void main(String[] args) {
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					createandshowgui();
				}
			});
			
	}
}
