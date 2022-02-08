package com.simplilearn.calculator;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//Asking User to Enter Operator Choice
		
		while(true) {
		System.out.println("Enter the operator: + , - , * , / , %  ");
		
		char choice= sc.next().charAt(0);
		
		
				
		//Asking user to enter numbers
		System.out.println(" Enter the First Number:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2= sc.nextInt();
		
		//Using switch case to calculation
		int res;
		
		switch(choice) {
		// Perform addition 
		case '+':
			res = num1 + num2;
			System.out.println("Adding two number is:");
			System.out.println(num1+ " + "+num2 + " = " +res);
			break;
		// Perform substraction 
		case '-':
			res= num1-num2;
			System.out.println("Substracting two number is : ");
			System.out.println(num1+" - "+ num2+" = "+res);
			break;
		// Perform multiplication
		case '*':
			res=num1*num2;
			System.out.println("Multiplicating two number is:");
			System.out.println(num1+" * "+num2+ " ="+res);
		    break;
		    
		//Perform division
		case '/':
			res=num1/num2;
			System.out.println("Dividing two number is :");
			System.out.println(num1+" /"+num2+ "=" +res);
			break;
			
	     // Perform modulo 
		case'%':
			res=num1%num2;
			System.out.println("Modulo of two number is:");
			System.out.println(num1+ "% "+num2+"= "+res);
			break;
			
		default :
			System.out.println("invalid operator ");
			break;
			
		
		}
        System.out.println("Go again?");
        String goAgain = sc.next();
        if (!goAgain.equals("y")) {
           break;
        } 
		}
		
		
}

}
