package com.simplilearn.thread;
	
public class MainThread1 implements Runnable{
    public static int count=0;
    
    public MainThread1() {
        
    }
    public void run() {
        while(count<=10)
        {
            System.out.println("Exc Thread "+ (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Starting Main thread...");
        
        MainThread1 main=new MainThread1();
        Thread m= new Thread();
        m.start();
        
        while(count<=10)
        {
            System.out.println("Main Thread "+ (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
