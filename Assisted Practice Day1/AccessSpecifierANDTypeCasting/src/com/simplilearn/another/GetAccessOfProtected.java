package com.simplilearn.another;
import com.simplilearn.accessspecifier.AccessSpecifier;
public class GetAccessOfProtected extends AccessSpecifier{

public static void main(String[] args) {
		
		GetAccessOfProtected obj=new GetAccessOfProtected();
		obj.display();// able to call protected method
		obj.test();//not able to call private method
		obj.hello();//able to call public method
		obj.world();//not able to call default method
	}

}
