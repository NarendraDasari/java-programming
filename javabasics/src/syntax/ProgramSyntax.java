package syntax;

public class ProgramSyntax {

	public static void main(String[] args) {
			System.out.println("Hello World");
			System.out.println("how r u");
			
			String userName="ggghgghjhecommeghgj13";
			String firstName="Chaitanya";
			String lastName="Nanduri";
	        String fullName=firstName+ " " +lastName;
			greetUser(fullName);
	}
	
	public static void greetUser(String name)
	{
		System.out.println("Welcome "+ name);
	}
	
}
