package sourcecode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class attendence extends JPanel implements ActionListener{
	JButton Here1, Absent1, Here2, Absent2, Here3, Absent3;


	public attendence(){
		super(new BorderLayout());
		
		
		
		JButton Here1 = new JButton("Here");
		Here1.addActionListener(this);
		
		JButton Here2 = new JButton("Here");
		Here2.addActionListener(this);
		
		JButton Here3 = new JButton("Here");
		Here3.addActionListener(this);
		
		JButton Absent1 = new JButton("Absent");
		Absent1.addActionListener(this);
		
		JButton Absent2 = new JButton("Absent");
		Absent2.addActionListener(this);
		
		JButton Absent3 = new JButton("Absent");
		Absent3.addActionListener(this);
		
		JLabel me = new JLabel("me");
		JPanel buttons = new JPanel();
		buttons.add(me);
		buttons.add(Here1);
		buttons.add(Absent1);
		
		
		JLabel Perry = new JLabel("Perry");
		JPanel perry = new JPanel();
		perry.add(Perry);
		perry.add(Here2);
		perry.add(Absent2);
		
		JLabel test = new JLabel("Test");
		JPanel Test = new JPanel();
		Test.add(test);
		Test.add(Here3);
		Test.add(Absent3);
		
		
		
		add(perry, BorderLayout.PAGE_START);
		add(buttons, BorderLayout.CENTER);
		add(Test, BorderLayout.SOUTH);
		
	}
	
	public static void CreateAndShowGUI() {
		JFrame hi = new JFrame("Attendence Records");
		hi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		hi.add(new attendence());
		
		hi.pack();
		hi.setVisible(true);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				UIManager.put("swing.boldmetal", Boolean.FALSE);
				CreateAndShowGUI();
			}

		
		});

	}





	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
