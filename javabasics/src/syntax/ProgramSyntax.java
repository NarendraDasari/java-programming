package syntax;

public class ProgramSyntax {

	public static void main(String[] args) {
			System.out.println("Hello World");
			System.out.println("how r u");
			
			String userName="ggghgghjhecommeghgj13";
			String firstName="Chaitanya";
			String lastName="Nanduri";
			String middleName="Babu";
			String prefix ="Mrs";
	        String fullName=firstName+ " " +lastName;
			greetUser(fullName);
			decorateAndgreetUser(firstName, lastName);
			greetUserwithMiddlename(firstName, middleName, lastName);
			honor(prefix, firstName, middleName, lastName);
	}
	
	public static void greetUser(String name)
	{
		System.out.println("Welcome "+ name);
	}
	
	public static void decorateAndgreetUser(String firstName,String lastName)
	{
		System.out.println("Welcome "+ firstName + " "+ lastName +".");
	}
	public static void greetUserwithMiddlename(String firstName,String middleName,String lastName)
	{
		System.out.println("Welcome "+ firstName + " " + middleName +" " + lastName +".");
	}
	public static void honor(String prefix,String firstName,String middleName,String lastName)
	{
		System.out.println("Welcome " + prefix +" " + firstName + " " + middleName + " "  + lastName +".");
	}
	
	
}
