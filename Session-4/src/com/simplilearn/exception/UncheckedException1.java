package com.simplilearn.exception;

public class UncheckedException1 {
public static void main(String[] args) {
		
		String name=null;
		
		if(name.equals("admin"))
			System.out.println("Valid user");
		else
			System.out.println("Invalid user");
	}

}
