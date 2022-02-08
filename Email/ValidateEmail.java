package com.simplilearn.email;
// Importing the ArrayList Package
import java.util.ArrayList;
import java.util.Scanner;

//Giving The Class Name...
public class ValidateEmail {

	//Opening The Main Methods..
	public static void main(String[] args) {
		while(true) {
		// Using The ArrayList To Store List of E-mails 
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Harsha@gmail.com");
		list.add("Arjuna@example.com");
		list.add("Ganesha@outlook.com");
		list.add("Harsha@outlook.com");
		list.add("Krishna@gmail.com");
		
		//Printing the List Of Elements Stored In list 
		System.out.println();
		System.out.println(list);
		System.out.println();
		
		
		// Asking User To Enter the Proper E-Mail..
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your E-mail:");
		String s=sc.nextLine();
		
		// Using If-Else Statement 
		if(list.contains(s)) {
			System.out.println();
			System.out.println("Correct!\t"+s);
		}
		else 
		{
			System.out.println();
			System.out.println("Enter a valid Mail");
		}
		System.out.println();
		
		 System.out.println("Go again?");
	        String goAgain = sc.next();
	        if (!goAgain.equals("y")) {
	           break;
	        } 
		}
		
		
	}
}
