package jwindow;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class MyProgram implements ActionListener
{
	JButton myButton1 = null;
	JButton myButton2 = null;
	JButton myButton3 = null;
	JButton myButton4 = null;
	JButton myButton5 = null;
	JButton myButton6 = null;
	JButton myButton7 = null;
	JButton myButton8 = null;
	JButton myButton9 = null;
	JButton myButton10 = null;
	JButton myButton11 = null;
	JButton myButton12 = null;
	JButton myButton13 = null;
	JButton myButton14 = null;
	static JFrame myFrame = null;
	String num = "";
	
	public static void main(String[] args)
	{
		
		new MyProgram();
		myFrame.setSize(225,200);
		myFrame.setLocationRelativeTo(null);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		Object control = event.getSource();
		//Number buttons
		if (control == myButton1)
		{
			num = num+"1";
			myFrame.getContentPane().setBackground(Color.blue);
			JOptionPane.showMessageDialog(null, num);
		}
		else if (control == myButton2)
		{
			num = num+"2";
			myFrame.getContentPane().setBackground(Color.green);
			JOptionPane.showMessageDialog(null, num);
		}
		else if (control == myButton3)
		{
			num = num+"3";
			myFrame.getContentPane().setBackground(Color.yellow);
			JOptionPane.showMessageDialog(null, num);
		}
		else if (control == myButton4)
		{
			num = num+"4";
			myFrame.getContentPane().setBackground(Color.orange);
			JOptionPane.showMessageDialog(null, num);
		}
		else if (control == myButton5)
		{
			num = num+"5";
			myFrame.getContentPane().setBackground(Color.magenta);
			JOptionPane.showMessageDialog(null, num);
		}
		else if (control == myButton6)
		{
			num = num+"6";
			myFrame.getContentPane().setBackground(Color.black);
			JOptionPane.showMessageDialog(null, num);
		}
		else if (control == myButton7)
		{
			num = num+"7";
			myFrame.getContentPane().setBackground(Color.red);
			JOptionPane.showMessageDialog(null, num);
		}
		else if (control == myButton8)
		{
			num = num+"8";
			myFrame.getContentPane().setBackground(Color.darkGray);
			JOptionPane.showMessageDialog(null, num);
		}
		else if (control == myButton9)
		{
			num = num+"9";
			myFrame.getContentPane().setBackground(Color.cyan);
			JOptionPane.showMessageDialog(null, num);
		}
		else if (control == myButton10)
		{
			num = num+"0";
			myFrame.getContentPane().setBackground(Color.pink);
			JOptionPane.showMessageDialog(null, num);
		}
		else if (control == myButton11)
		{
			//Clear button
			num = "";
			myFrame.getContentPane().setBackground(Color.white);
			JOptionPane.showMessageDialog(null, "Cleared");
		}
		else if (control == myButton12)
		{
			//Show number button
			myFrame.getContentPane().setBackground(Color.white);
			JOptionPane.showMessageDialog(null, "Number: "+num);
		}
		else if (control == myButton13)
		{
			//Call button
			if (num.length()>12)
			{
				myFrame.getContentPane().setBackground(Color.white);
				JOptionPane.showMessageDialog(null, "Calling "+num+" ...Error!");
			}
			else if (num.length()<7)
			{
				myFrame.getContentPane().setBackground(Color.white);
				JOptionPane.showMessageDialog(null, "Calling "+num+" ...Error!");
			}
			else
			{
				myFrame.getContentPane().setBackground(Color.white);
				JOptionPane.showMessageDialog(null, "Calling "+num+" ...Success!");
			}

		}
		
		else if (control == myButton14)
		{
			//End call button
			myFrame.getContentPane().setBackground(Color.white);
			JOptionPane.showMessageDialog(null, "Hang up");
		}
	}
	
	
	public MyProgram()
	{
		//frame
		myFrame = new JFrame();
		myFrame.setTitle("Phone Dial");
		//myFrame.setSize(100,50);
		//myFrame.setLocation(825,425);
		myFrame.setLayout(new GridLayout(5,3,3,3));
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.getContentPane().setBackground(Color.white);
		
		   //number buttons
	       myButton1 = new JButton("1");  
	       myButton1.addActionListener(this);	// add JButton to ActionListener
	       myFrame.add(myButton1);		// add JButton to JFrame

	 	   myButton2 = new JButton("2");  
	       myButton2.addActionListener(this);
	       myFrame.add(myButton2);		// add JButton to JFrame
	       
	       myButton3 = new JButton("3");  
	       myButton3.addActionListener(this);
	       myFrame.add(myButton3);		// add JButton to JFrame
	       
	       myButton4 = new JButton("4");  
	       myButton4.addActionListener(this);
	       myFrame.add(myButton4); 		// add JButton to JFrame
	       
	       myButton5 = new JButton("5");  
	       myButton5.addActionListener(this);
	       myFrame.add(myButton5); 		// add JButton to JFrame
	       
	       myButton6 = new JButton("6");  
	       myButton6.addActionListener(this);
	       myFrame.add(myButton6);		// add JButton to JFrame
	       
	       myButton7 = new JButton("7");
	       myButton7.addActionListener(this);
	       myFrame.add(myButton7);		// add JButton to JFrame
	       
	       myButton8 = new JButton("8");
	       myButton8.addActionListener(this);
	       myFrame.add(myButton8);		// add JButton to JFrame
	       
	       myButton9 = new JButton("9");
	       myButton9.addActionListener(this);
	       myFrame.add(myButton9);		// add JButton to JFrame
	       
	       myButton10 = new JButton("0");
	       myButton10.addActionListener(this);
	       myFrame.add(myButton10);		// add JButton to JFrame
	       
	       //special buttons
	       myButton11 = new JButton("Clear");
	       myButton11.addActionListener(this);
	       myFrame.add(myButton11);		// add JButton to JFrame
	       	//show number button
	       myButton12 = new JButton("*");
	       myButton12.addActionListener(this);
	       myFrame.add(myButton12);		// add JButton to JFrame
	        //Call button
	       myButton13 = new JButton("Call");
	       myButton13.addActionListener(this);
	       myFrame.add(myButton13);		// add JButton to JFrame
	       	//End call button
	       myButton14 = new JButton("End");
	       myButton14.addActionListener(this);
	       myFrame.add(myButton14);		// add JButton to JFrame
	       
	       //show buttons
	       myFrame.pack();
	       
	       myFrame.setVisible(true);    
	}
}
