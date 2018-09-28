package checkerboard;

import java.util.Scanner;

public class Checkerboard 
{
	//main
	public static void main(String[] args) 
	{
		
		//calling function
		printCheckerboard(3,5);
		printCheckerboard(4,5);
		printCheckerboard(9,8);
		
		
		/*
		//user input just for fun
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int nume1 = input.nextInt();
		System.out.println("Enter a number: ");
		int nume2 = input.nextInt();
		printCheckerboard(nume1,nume2);
		input.close();
		*/
	}
	
	
	//checkerboard method
	public static void printCheckerboard(int numRows,int numCols)
	{
		//variables
		int row = 0;
		
		//for each row
		for (row=0; row<numRows; row++)
		{
			
			//for each column in this row
			for(int col=0;col<numCols;col++)
			{
				//print # or space
				//if 'row' is even
				if (row % 2 == 0)
				{
					//if 'row' and 'col' is even
					if (col % 2 == 0)
					{
						System.out.print("#");
					}
					//if 'row' is even and 'col' is odd
					if (col % 2 != 0)
					{
						System.out.print(" ");
					}
					
				}
				//if 'row' is odd
				else if (row % 2 != 0)
				{
					//if 'row' is odd and 'col' is even
					if (col % 2 == 0)
					{
						System.out.print(" ");
					}
					//if 'row' and 'col' is odd
					if (col % 2 != 0)
					{
						System.out.print("#");
					}
					
					
				}
				
			}
			
			//goto next line
			System.out.println("");
			
		}
		
		//adding blank line
		System.out.println("");
		
		
		
	}


}
