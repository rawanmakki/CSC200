

public class Driver 
{

	public static void main(String[] args)
	{
		String s = "hello";
		String s2 = "elephant";
		Driver.displayString(s);
		Driver.displayWithSpaces(s);
		Driver.displayInReverse(s);
	}
	
	static void displayString(String s)
	{
		//should display the contents of the String one character per line
		for(int i = 0; i < s.length(); i = i + 1)
		{
			System.out.println(s.charAt(i));
		}
	}
	
	static void displayWithSpaces(String s)
	{
		String answer = "";
		for(int i = 0; i < s.length(); i = i + 1)
		{
			answer = answer + s.charAt(i) + " ";
		}
		System.out.println(answer);
	}
	
	//this method should display on a single line the input String
	//in reverse: "hello" -> "olleh"
	static void displayInReverse(String s)
	{ 
		  
			  
		    for (int i = s.length()-1; i >= 0 ; i--) {
		    	
		    
		    System.out.print(s.charAt(i));

		    }
		}
			}
	


//this is a single line comment

/*
 * 	//memory -> variables
		//type name = value;
		int a = 5; //alice whole number
		String s = "hello"; //alice text string
		boolean b = false; //alice boolean
		
		//java arrays -collections of variables
		//type[] name = new type[how many];
		int[] ar = new int[10]; //empty array that I can add 10 things to
		ar[0] = 5;
		ar[1] = 6;
		int[] ar2 = {1,2,7,14};
		ar2[1] = -5;
		
		//asking question - conditionals
		//if(boolean-expr){ 1 or more statements } else { 1 or more statements }
		if(a < 10)
		{
			System.out.println("Less than 10!");
			a = a * 2;
		}
		else
		{
			a = a / 2;
		}
		
		//repetition
		//loops
		//for(initial counter; boolean expr; change counter) { 1 or more statements }
		//while(boolean expr) { 1 or more statements }
		//do { 1 or more statements }while(boolean expr); post-check loop
		for(int i = 0; i < 10; i = i + 1) //counting problems
		{
			System.out.println(i);
		}
		
		int i = 0;
		while(i < 10) //problems where we do not know how many times we must repeat
       		{
			System.out.println(i);
			i = i + 1;
		}
		
		i = 0;
		do //problems where the body must execute at least once
		{
			System.out.println(i);
			i = i + 1;
		}
		while(i < 10);
		
		//boolean operators
		 * == equivalence
		 * != not equal to
		 * 
 */
 