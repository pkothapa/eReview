package com.apackage;

import com.bpackage.B;
import com.bpackage.BReq;
import com.bpackage.BResp;

public class A {

	 B b;
	 public A(B b){
		 this.b=b;
		 System.out.println("enter into constructor");
	 }
	 
	 /*Here instead of constructor we can write like this 
	  * B b=new B();
	  * but Mockito can't mock the new operators,
	  * means Mocking of B class is not possible.This is possible by powermockito*/
	 
	 public AResp m1(AReq areq){
		 System.out.println("enter into m1()");
		 
		 //preparing breq object
		 BReq breq=new BReq();
		 breq.setId(areq.getId());
		 breq.setName(areq.getName());
		 System.out.println("prepared breq object");

		 //call m2(breq) of B class
		 BResp bresp=b.m2(breq);
		 System.out.println(bresp.getStatusCode());
		 
		 //converting bresp to aresp
		 AResp aresp=new AResp();
		 aresp.setStatus(bresp.getStatusCode());
		 return aresp;
	 }
}
 