package com.simplilearn.method;

public class MethodOverloading {
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b,int c) {
		return a+b+c;
	}
	public float add(float a, float b) {
		return a+b;
	}
	public float add(float a, float b ,float c) {
		return a+b+c;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		System.out.println(" add of 2 int "+m.add(2,3));
		System.out.println(" add of 3 int "+m.add(2,3,8));
		System.out.println(" add of 2 float "+m.add(2.0f,3.8f));
		System.out.println(" add of 3 float "+m.add(2.0f,3.0f,5.0f));
		System.out.println(" add of 2 double "+m.add(2.0,3.0));
	}
}
