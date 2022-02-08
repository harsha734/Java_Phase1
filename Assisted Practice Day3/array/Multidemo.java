package com.simplilearn.array;

public class Multidemo {
 public static void main(String[] args) {
	int a[][]= {{2,4},{6,8}};
	int b[][]= {{0,1},{3,5}};
	int c[][]=new int[2][2];
	
	//Displaying Addition of Matrices..
	
	for (int i=0;i<2;i++)
	{
		for(int col=0;col<2;col++)
		{
			c[i][col]=a[i][col]+b[i][col];
			System.out.print(c[i][col]+"\t");
			
		}
		System.out.println();
	}
	
}
}
