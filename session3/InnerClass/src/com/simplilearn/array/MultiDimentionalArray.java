package com.simplilearn.array;

import java.util.Scanner;

public class MultiDimentionalArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int array[][]=new int[3][3];
	for (int i=0;i<3;i++)
	{
		for(int col=0;col<3;col++)
		{
			System.out.println("enter the element:");
			array[i][col]=sc.nextInt();
		}
	}
	for (int i=0;i<3;i++)
	{
		for(int col=0;col<3;col++)
		{
			System.out.print(array[i][col]+"\t");
		
		}
		System.out.println();
	}
	

}
}
