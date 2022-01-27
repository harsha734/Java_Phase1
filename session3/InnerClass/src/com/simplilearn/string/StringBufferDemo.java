package com.simplilearn.string;

public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer str =new  StringBuffer("hello");
	System.out.println("char at indes 4:"+str.charAt(4));
	
	System.out.println("str len "+str.length());
	System.out.println("replace"+str.replace(0, 5, "welcom"));
	
	
	
	
	StringBuilder str1 =new  StringBuilder("hello");
	System.out.println("char at indes 4:"+str.charAt(4));
	
	System.out.println("str len "+str.length());
	System.out.println("replace"+str.replace(0, 5, "welcom"));
}
}
