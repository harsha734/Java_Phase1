package com.simplilearn.thread;

public class MultiThreadDemo extends Thread {
	public void run() {
		for (int i=0; i<5;i++) {
			try {
				Thread.currentThread().sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+""+i);
			
		}
	}
	public static void main(String[] args) {
		MultiThreadDemo t1=new MultiThreadDemo();
		MultiThreadDemo t2=new MultiThreadDemo();
	MultiThreadDemo t3=new MultiThreadDemo();
		t1.start();
		t2.start();t3.start();
		
	}
}
