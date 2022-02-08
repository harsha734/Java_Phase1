package com.simplilearn.method;

public class Employee {
	    //class level variables
	    int Eid;
	    String Ename;
	    String Edpt;
	    
	    //default constructor
	    public Employee()
	    {
	        Eid=23;
	        Ename="harsha";
	        Edpt="xyz";
	    }
	    public Employee(int Eid,String Ename, String Edpt)
	    {
	        this.Eid=Eid;
	        this.Ename=Ename;
	        this.Edpt=Edpt;
	        
	    }
	    
	    public static void main(String[] args) {
	        
	        //when you create object automatically it calls default constructor
	        //if no default constructor then compiler will create that
	        Employee obj=new Employee();
	        System.out.println("Employee  1");
	        System.out.println("EId: "+obj.Eid);
	        System.out.println("EName: "+obj.Ename);
	        System.out.println("EName: "+obj.Edpt);
	        
	        Employee obj2= new Employee(45,"Vardhan","abc");
	        System.out.println("User 2");
	        System.out.println("EId: "+obj2.Eid);
	        System.out.println("EName: "+obj2.Ename);
	        System.out.println("Edepartment: "+obj2.Edpt);
	        
	        
	        
	    }
	}


