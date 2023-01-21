package syntax;
import calculator.*;

public class ProgramSyntax {

	public static void main(String[] args) {
			System.out.println("Hello World");
			System.out.println("how r u");
			
			String userName="ggghgghjhecommeghgj13";
			String firstName="Chaitanya";
			String lastName="Nanduri";
			String middleName="Babu";
			//String prefix ="Mrs";
	        String fullName=firstName+ " " +lastName;
			//greetUser(fullName);
			//decorateAndgreetUser(firstName, lastName);
			//greetUserwithMiddlename(firstName, middleName, lastName);
			//honor(prefix, firstName, middleName, lastName);
	        
	        greetUser(firstName, lastName);
	        
	        calculatorClass calc=new calculatorClass();   
	        calc.add(50,50);
	        calc.sub(30,10);
	        calc.multiply(2,5);
	        calc.divide(15,5);
	        
	        
	}
	
	public static void greetUser(String username)
	{
		System.out.println("Welcome "+ username);
	}
	
	public static void greetUser(String firstName,String lastName) 
	{
	    System.out.println("Welcome " + firstName + " "+ lastName+".");	
	}
	
	public static void greetUser(String firstName, String middleName, String lastName) 
	{
		System.out.println("Welcome " + firstName + " "+ middleName +" "+ lastName + ".");
	}
	public static void greetUser(String prefix,String firstName,String middleName,String lastName)
	{
         System.out.println("Welcome " + prefix + " "+firstName +" " +middleName +" " + lastName +".");
	}
	
}
