package jwindow;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Jwindow 
{
	
	public void actionPerformed(ActionEvent event)
	{
		JOptionPane.showMessageDialog(null, "okay");
	}
	
	
	public static void main(String[] args) 
	{
		new Jwindow();
	}

	public Jwindow()
	{
		//frame
		JFrame myFrame = new JFrame();
		myFrame.setTitle("Title");
		myFrame.setSize(200,140);
		myFrame.setLocation(750,400);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		//layout
		FlowLayout myLayout = new FlowLayout();
		myFrame.setLayout(myLayout);
		JLabel myLabel = new JLabel("Do you want to continue?"); 
		myFrame.add(myLabel);
		//button 1
		JButton myButton1 = new JButton("Yes");
		//myButton1.addActionListener((ActionListener) this);
		myFrame.add(myButton1); 
		//button 2
		JButton myButton2 = new JButton("No");
		myFrame.add(myButton2); 
		myFrame.setVisible(true);
	}
}
