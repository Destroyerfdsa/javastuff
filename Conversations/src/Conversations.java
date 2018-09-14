import java.util.Scanner;

public class Conversations {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name;
		String noun;
		String verb;
		int int1 = 0;
		double double1 = 0;
		//Ask for name
		System.out.print("What is your name: ");
		name = input.nextLine();
		//Ask for noun
		System.out.print("Enter a noun: ");
		noun = input.next();
		 //noun = input.nextLine();	
		//Ask for Verb
		System.out.print("Enter a verb: ");
		verb = input.next();
		//verb = input.nextLine();
		 //Ask for num
		System.out.print("Enter a Number: ");
		if(input.hasNextInt())
		{
			int1 = input.nextInt();
		}
		else
		{
			String error = input.next();
			System.out.println("Invalid entry: " + error);
		}
		//Ask for Double value
		System.out.print("Enter a Double: ");
		if(input.hasNextDouble())
		{
			double1 = input.nextDouble();
		}
		else
		{
			String error = input.next();
			System.out.println("Invalid entry: " + error);
		}
		String story = "One day, " + name + " found a " + noun;
		story += " and they decided to " + verb + " it.\n";
		story += "After " + int1 + " Minutes, they were given $" + double1 +" by a stranger who said ";
		story += name + " I know who you are,\nbut you don't know me, you are in danger!\nUse this money to join the association.\nThen he disappeared.";
		System.out.println(story);
	}

}
