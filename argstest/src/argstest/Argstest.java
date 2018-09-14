package argstest;

import java.util.Scanner;

public class Argstest {

	public static void main(String[] args) 
	{
		if (args.length > 0)
		{
			System.out.println("Here is the first arg" + args[0]);
		}
		if (args.length > 1)
		{
			System.out.println("Here is the second arg" + args[1]);
		}
		else
		{
			System.out.println("Nothing to see here...");
		}
		

		

	}

}
