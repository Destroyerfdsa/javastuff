/*Nicholaus Whites
 Factorial Project
 9/6/2018*/


import java.util.Scanner;

public class Factorials {                                              
                                                                       
	public static void main(String[] args)                             
	{                                                                  
		Scanner input = new Scanner(System.in);
		//Variables
		int i,factori = 0;
		int int2 = 5;
		boolean done = false;
		
		                      
		//start
		System.out.print("Enter a number: ");
		//Asking for integer
		if(input.hasNextInt() != false)                                         
		{                                                              
			int2 = input.nextInt();
			//System.out.print(int2);
			input.close();
		}                          
		//if not an integer                           
		else                                                           
		{                                                              
			String error = input.next();
			System.out.println("Oops! Please enter an integer!\nInvalid entry: " + error);
			input.close();
			return; //Exit Program
		}
		
		
		factori = 1;
		//For loop
		for(i=1;i<=int2;i++)
		{
			factori=factori*i;
		}
		System.out.println("For Loop: "+factori);
		
		//While loop
		factori = 1;
		
		while (i!=-15)
		{
			factori=factori*i;
		}
		System.out.println("While Loop: "+factori);
        
        //do-while loop
		factori = 1;
		
		do
		{
			factori=factori*i;
			
		}
		while(i<int2);
		System.out.println("Do-While Loop: "+factori);
	}

}
