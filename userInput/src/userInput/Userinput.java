package userInput;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nicholaus Calc 2.0");
		System.out.print("Enter two numbers: ");
		
		if (input.hasNextInt())
		{
			int thirdnum = input.nextInt();
			
			if (input.hasNextInt())
			{
				int fournum = input.nextInt();
				System.out.println("Your first num: " + thirdnum);
				System.out.println("Your second num: " + fournum);
				
				int sum2 = thirdnum + fournum;
				System.out.println("sum: " + sum2);
			}
			else
			{
				System.out.println("Your second value is not a number!");
			}
		}
		else
		{
			System.out.println("Your first value is not a number!");
		}
		
		
		
		
	}

}
