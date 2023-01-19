package syntax;

public class ProgramSyntax {

	public static void main(String[] args) {
			System.out.println("Hello World");
			System.out.println("how r u");
			
			String userName="Lakshmi";
	
			greetUser(userName);
	}
	
	public static void greetUser(String name)
	{
		System.out.println("Welcome "+ name);
	}
	
}
