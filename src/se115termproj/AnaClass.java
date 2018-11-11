package se115termproj;
import java.util.*;
public class AnaClass 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[]args)
	{
		boolean loginWrongValue = false;
		int loginType;
		System.out.println("Please enter your login type.\n1 for Admin\n2 for Librarian\n3 for Student");
		while (!input.hasNextInt()) {
			   System.out.println("number, please!");
			   input.nextLine();
			}
		loginType = input.nextInt();
		while(loginWrongValue == false) 
		{
			switch(loginType) 
			{
			case 1:
				Admin();
				loginWrongValue = true;
				break;
			case 2:
				Librarian();
				loginWrongValue = true;
				break;
			case 3:
				Student();
				loginWrongValue = true;
				break;
			default:
				System.out.println("You entered wrong value.");
				loginType = input.nextInt();
				break;
		}
		
	}
		
	}
	static void Admin()
	{
		boolean loginStatus = false;
		System.out.println("Please enter your username! ");
		String username = input.next();
		String trueUser = "user";
		System.out.println("Please enter your password! ");
		String pass = input.next();
		String truePass = "pass";
		while(loginStatus == false) {
		if(username.equals(trueUser) && pass.equals(truePass))
		{
			System.out.println("User " + username +" successfully logon as admin!");
			loginStatus = true;
			break;
		}
		else
		{
			System.out.println("Wrong username or password!");
		}
		}
		System.out.println("List of what you can do:\n1-List books");
		}
	static void Librarian()
	{
		boolean loginStatus = false;
		while(loginStatus == false)
		{
		System.out.println("Please enter your username! ");
		String username = input.next();
		String trueUser = "user";
		System.out.println("Please enter your password! ");
		String pass = input.next();
		String truePass = "pass";
		if(username.equals(trueUser) && pass.equals(truePass))
		{
			System.out.println("User " + username +" successfully logon as librarian!");
			loginStatus = true;
			break;
		}
		else
		{
			System.out.println("Wrong username or password!");
		}
		}
		System.out.println("List of what you can do:\nPlease enter your choice\n1-List books");
	}
	
	static void Student()
	{
		boolean loginStatus = false;
		System.out.println("Please enter your username! ");
		String username = input.next();
		String trueUser = "user";
		System.out.println("Please enter your password! ");
		String pass = input.next();
		String truePass = "pass";
		while(loginStatus == false) {
		if(username.equals(trueUser) && pass.equals(truePass))
		{
			System.out.println("User " + username +" successfully logon as student!");
			loginStatus = true;
			break;
		}
		else
		{
			System.out.println("Wrong username or password!");
		}
		}
		System.out.println("List of what you can do:\n1-List books");
	}
}
