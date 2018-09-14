import java.util.Calendar;
public class StringTheory {

	public static void main(String[] args) 
	{
		String str1 = "Bibbety";
		String str2 = "Bobbety";
		String str3 = "Boo";
		String str4 = "BIBBETY";
		
		//is string equal to string
		System.out.println("str1 equals str4: " + str1.equals(str4));
		System.out.println("str1 equals str4 (ignore case): " + str1.equalsIgnoreCase(str4));
		
		//changing string letters
		System.out.println("replacing b with p in str1: " + str1.replace("b","p"));
		
		//printing letters
		System.out.println("First three characters in str2: " + str2.substring(0, 3));
		
		//changing to uppercase
		System.out.println("uppercase str3: " + str3.toUpperCase());
		
		//this is the time output
		String result1 = String.format("The current time is: %tr", Calendar.getInstance());
		System.out.println(result1);
		
		//adding two strings and printing
		String str1a2 = str1 + str2;
		System.out.println("str1 + str2: " + str1a2);
		
		//converting string to number
		String myString2 = "5";
		int myInt = Integer.parseInt(myString2);
		System.out.println("parseInt: " + myInt);
		
		//location of e in str1
		int result2 = str1.indexOf("e");
		System.out.println("location of 'e' in str1: " + result2);
		
	}

}
