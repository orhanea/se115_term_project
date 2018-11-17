package se115termproj;
import java.util.Scanner;
public class Book {
	Scanner input = new Scanner(System.in);
	private static int bookID;
	private static String name;
	private static String author;
	private static String details;
	public Book(int bookID,String name,String author,String details) 
	{
		this.bookID = bookID;
		this.name = name;
		this.author = author;
		this.details = details;
	}

	public static int getID() {
		return bookID;
	}
	public static String getName() {
		return name;
	}
	public static String getAuthor() {
		return author;
	}
	public static String getDetails() {
		return details;
	}
}