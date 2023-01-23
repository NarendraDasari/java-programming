package syntax;
import java.util.Scanner;

import calculator.*;

public class ProgramSyntax {

	public static void main(String[] args) {
			//System.out.println("Hello World");
			//System.out.println("how r u");
			
			
			Scanner input=new Scanner(System.in);
			System.out.println("Enter your FirstName");
			String firstName=input.next();
			System.out.println("Enter your LastName");
			String lastName=input.next();
			
			greetUser(firstName,lastName);
			
			System.out.println("the below two input lines is for ADDITION");
			System.out.println("Enter a value");
			int a=input.nextInt();
			System.out.println("Enter b value");
			int b=input.nextInt();
			
			
			calculatorClass calc=new calculatorClass();
			calc.add(a, b);
			
			
			 System.out.println("the below two lines is for SUBSTRACTION");
		     System.out.println("Enter x value");
		     int x=input.nextInt();
		     System.out.println("Enter y value");
		     int y=input.nextInt();
		      
		     calc.sub(x, y);
		      
		      System.out.println("the below two lines is for MULTIPLICATION");
			  System.out.println("Enter p value");
			  int p=input.nextInt();
			  System.out.println("Enter q value");
			  int q=input.nextInt();
			  
			   calc.multiply(p, q);
			   
			   System.out.println("the below two lines is for DIVISION");
			   System.out.println("Enter m value");
			   int m=input.nextInt();
			   System.out.println("Enter n value");
			   int n=input.nextInt();
			    
			   calc.divide(m, n);
			   
			
			
			
			
			
			
	        //calculatorClass calc=new calculatorClass();   
	        //calc.add(50,50);
	        //calc.sub(30,10);
	        //calc.multiply(2,5);
	        //calc.divide(15,5);
	        
	        
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
