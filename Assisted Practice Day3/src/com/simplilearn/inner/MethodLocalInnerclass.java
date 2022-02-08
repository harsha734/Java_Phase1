package com.simplilearn.inner;

public class MethodLocalInnerclass {
public void display()
{
	class Inner
	{
		void myMethod()
		{
			System.out.println("Hai");
		}
	}
	
	
	Inner inner= new Inner();
	inner.myMethod();
		
}

public static void main(String[] args) {
	MethodLocalInnerclass mlic=new MethodLocalInnerclass();
	mlic.display();
}
}
