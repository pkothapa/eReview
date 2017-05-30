package com.apackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

//import com.bpackage.B;
//import com.bpackage.BReq;
//import com.bpackage.BResp;

public class ATest {

	//B b;
	@Before
	public void setUp() throws Exception {
		//b=Mockito.mock(B.class);
	}


	@Test
	public void testM1() {
		
		//creating object to A class
		//A a=new A(b);
	
		
		//prepare areq object
		//AReq areq=new AReq();
		//areq.setId("1");
		//areq.setName("siva");
		
		//call m1(areq) of A class,then it returns aresp
		//AResp aresp=a.m1(areq);
		
		
		//BResp bresp=new BResp();
		//bresp.setStatusCode("0000");
		//Mockito.when(b.m2(Matchers.any(BReq.class))).thenReturn(bresp);
		
		//assertEquals("0000", aresp.getStatus());
	}


	@After
	public void tearDown() throws Exception {
	}
}
