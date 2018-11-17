package se115termproj;
import java.util.*;
public class AnaClass 
{
	static Scanner input = new Scanner(System.in);
	static String username,password,trueUser,truePass;
	static int choice,loginType;
	static boolean choiceStatus,loginStatus = false;
	public static void main(String[]args)
	{
		boolean loginWrongValue = false;
		System.out.println("Please enter your login type.\n1 for Admin\n2 for Librarian\n3 for Student");
		checkInput();
		loginType = input.nextInt();
		while(loginWrongValue == false) 
		{
			switch(loginType) 
			{
			case 1:
				AdminMain();
				loginWrongValue = true;
				break;
			case 2:
				LibrarianMain();
				loginWrongValue = true;
				break;
			case 3:
				StudentMain();
				loginWrongValue = true;
				break;
			default:
				System.out.println("You entered wrong value.");
				loginType = input.nextInt();
				break;
		}
		
	}
		
	}
	static void AdminMain()
	{
		login(1);
		System.out.println("List of what you can do, please choose one:\n1-View Librarians\n2-Add Librarian\n3-Edit Librarian\n4-Delete Librarian\n5-View Details of a book\n6-Change details of a book");
		checkInput();//checks input for entering non-numeric value
		choice = input.nextInt();
		while(choiceStatus == false)
		{
		switch(choice) 
		{
		case 1: 
			System.out.println("bak bakalým reis kütüphanecilere");
			choiceStatus = true;
			break;
		case 2:
			System.out.println("kütüphaneci ekleme metodu");
			choiceStatus = true;
			break;
		case 3:
			System.out.println("kütüphaneci düzenleme metodu");
			choiceStatus = true;
			break;
		case 4:
			System.out.println("kütüphaneci silme metodu");
			choiceStatus = true;
			break;
		case 5:
			System.out.println("kitap bakma metodu");
			choiceStatus = true;
			break;
		case 6:
			System.out.println("kitap deðiþme metodu");
			choiceStatus = true;
			break;
		default:
			System.out.println("olm bi düzgün gir þunu, bir daha dene");
			choice = input.nextInt();
			break;
		}
		}
		}
	static void LibrarianMain()
	{
		login(2);
		System.out.println("List of what you can do:\nPlease enter your choice\n1-List books\n2-View details of a book\n3-Change details of a book\n4-Check Borrow status of a book\n5-Check book transactions.");
		checkInput();//checks input for entering non-numeric value
		choice = input.nextInt();
		while(choiceStatus == false)
		{
		switch(choice) 
		{
		case 1: 
			CreateBook();
			ListBook();
			choiceStatus = true;
			break;
		case 2:
			System.out.println("kitap detaylarýna bakma metodu");
			choiceStatus = true;
			break;
		case 3:
			System.out.println("kitap detayý deðiþtirme metodu");
			choiceStatus = true;
			break;
		case 4:
			System.out.println("ödünçlere bakma metodu");
			choiceStatus = true;
			break;
		case 5:
			System.out.println("kitap hareketlerini gösterme metodu");
			choiceStatus = true;
			break;
		default:
			System.out.println("olm bi düzgün gir þunu, bir daha dene");
			choice = input.nextInt();
			break;
		}
		}
	}
	
	static void StudentMain()
	{
		login(3);
		System.out.println("List of what you can do:\n1-List books\n2-Borrow a book\n3-View details of a book.");
		checkInput();//checks input for entering non-numeric value
		choice = input.nextInt();
		while(choiceStatus == false)
		{
		switch(choice) 
		{
		case 1: 
			System.out.println("kitaplara bakma metodu");
			choiceStatus = true;
			break;
		case 2:
			System.out.println("ödünç alma metodu");
			choiceStatus = true;
			break;
		case 3:
			System.out.println("detaylara bakma metodu");
			choiceStatus = true;
			break;
		default:
			System.out.println("olm bi düzgün gir þunu, bir daha dene");
			choice = input.nextInt();
			break;
		}
		}
	}
	static void checkInput()
	{
		while (!input.hasNextInt()) {
			   System.out.println("number, please!");
			   input.nextLine();
			}
	}
	static void login(int loginType) 
	{
		switch(loginType) 
		{
		case 1:
			trueUser = "admin";
			truePass = "pass";
			break;
		case 2:
			trueUser = "librarian";
			truePass = "pass";
			break;
		case 3:
			trueUser = "student";
			truePass = "pass";
			break;		
		}
		while(loginStatus == false)
		{
			System.out.println("Please enter your username! ");
			username = input.next();
			System.out.println("Please enter your password! ");
			password = input.next();
			if(username.equals(trueUser) && password.equals(truePass))
			{
				System.out.println("User " + username +" successfully logon!");
				loginStatus = true;
				break;
			}
			else
			{
				System.out.println("Wrong username or password!");
			}
		}
	}
	static void CreateBook() 
	{
		Book name = new Book(01,"Hayvan Çiftliði","George Orwell","Stalin'i anlatýyor.");
	}
	static void ListBook()
	{
		Book.getID();
		Book.getName();
		Book.getAuthor();
		Book.getDetails();
	}
}