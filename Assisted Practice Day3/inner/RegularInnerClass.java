package com.simplilearn.inner;

public class RegularInnerClass {
	private int a=10;
	class Inner
	{
		void display()
		{
			System.out.println("welcome");
			System.out.println("");
			}
	}
   public static void main(String[] args) {
	RegularInnerClass outer=new RegularInnerClass();
	RegularInnerClass.Inner inner= outer.new Inner();
	inner.display();
}
}
