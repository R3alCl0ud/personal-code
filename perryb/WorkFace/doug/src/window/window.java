package window;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.nio.file.*;
import java.text.*;
import java.io.*;

import window.icon;

public class window extends JPanel implements ActionListener{
	static private final String newline = "\n";
	JButton openbutton, savebutton;
	JTextArea log;
	JFileChooser fc;
	
	public window(){
		super(new BorderLayout());
	 
	
	 
	 
	log = new JTextArea(5,20);
	log.setMargin(new Insets(5,5,5,5));
	log.setEditable(false);
	JScrollPane logScrollPane = new JScrollPane(log);
	
	fc = new JFileChooser();
	
	
	openbutton = new JButton("Open a File", createImageIcon("images/Open16.gif"));
	openbutton.addActionListener(this);
		
	savebutton = new JButton("Save a File", createImageIcon("images/Save16.gif"));
	savebutton.addActionListener(this);
	
	JPanel buttonPanel = new JPanel();
	buttonPanel.add(openbutton);
	buttonPanel.add(savebutton);
	
	add(buttonPanel, BorderLayout.PAGE_START);
	add(logScrollPane, BorderLayout.CENTER);
			
		}
		
		
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == openbutton) {
			int returnVal = fc.showOpenDialog(window.this);
			
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				log.append("Opening: " + file.getName() + "." + newline);
				
				
			} else {
				 log.append("Open command cancelled by user." + newline);
			}
			log.setCaretPosition(log.getDocument().getLength());
		} else if  (e.getSource() == savebutton) {
			int returnVal = fc.showSaveDialog(window.this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				
				log.append("Saveing: " + file.getName() + "." + newline);
			} else {
				log.append("Save command cancelled by user." + newline);
			}
			log.setCaretPosition(log.getDocument().getLength());									
		}
		
	}
	protected static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = window.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
	public static void createAndShowGUI() {
		JFrame window = new JFrame("Text editor");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.add(new window());
		
		window.pack();
		window.setVisible(true);
		
	}
	
	 public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {
			 public void run() {
			   
				 UIManager.put("swing.boldMetal", Boolean.FALSE); 
				 createAndShowGUI();
			 }
			
		 });
		 
	  }
}
