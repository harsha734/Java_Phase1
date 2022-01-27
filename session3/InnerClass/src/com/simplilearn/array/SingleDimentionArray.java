package com.simplilearn.array;

import java.util.Scanner;

public class SingleDimentionArray {
public static void main(String[] args) {
	int array[]= {11,12,13,14,15};
	System.out.println(array[2]);
	for (int i=0;i<array.length; i++)
		
	{
		System.out.println(array[i]);
		
	}
	int a[]=new int[5];
	Scanner sc= new Scanner(System.in);
for (int i=0;i<array.length; i++)
		
	{
		System.out.println("enter a number:");
		a[i]=sc.nextInt();
		
	}
for (int i=0;i<array.length; i++)
	
{
	System.out.println(a[i]);
	
}
}
}
