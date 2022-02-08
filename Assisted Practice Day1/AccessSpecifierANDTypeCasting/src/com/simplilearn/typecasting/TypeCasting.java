package com.simplilearn.typecasting;

public class TypeCasting {
public static void main(String[] args) {
		
		//Implicit Conversion
		System.out.println("Implicit casting: \n");
		
		char a='A';
		System.out.println("Value of a:"+a);
		
		int b=a;
		System.out.println("Value of int"+b);
		
		float c=a;
		System.out.println("Value of c : "+c);

		
		long d=b;
		System.out.println("value of long :"+d);
		
		double e=b;
		System.out.println("value of double :"+e);
		System.out.println("\n");
		
		
		//Explicit Conversion
		System.out.println("Explicit conversion :\n");
		double x=80.90;
		
		int y=(int) x;
		System.out.println("value of x :"+x);
		System.out.println("value of y :"+y);
		
		char h=(char)x;
		System.out.println("value of x :"+x);
		System.out.println("value of h :"+h);
		
	}

}
