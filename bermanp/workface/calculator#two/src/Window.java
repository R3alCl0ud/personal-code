import java.awt.*;
import javax.swing.*;



public class Window extends JFrame{
	
public static void createandshowgui() {
	JFrame window = new JFrame("window");
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JLabel hi = new JLabel("Hello there");
	JLabel label = new JLabel("Hows it going");
	label.setPreferredSize(new Dimension(1280, 720));
	window.getContentPane().add(label, BorderLayout.CENTER);
	window.getContentPane().add(hi, BorderLayout.NORTH);
	
	window.pack();
	window.setVisible(true);
}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createandshowgui();
		}
	});
}
}