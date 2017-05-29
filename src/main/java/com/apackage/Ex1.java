package com.apackage;

public class Ex1 {

	public static void main(String args[]) {
		
		String s=CLEEnum.contains("DB004");
		
		if("SUCCESS".equals(s)){
			//business exception
			System.out.println("success");
		}
		if("DATAERROR".equals(s)){
			//business exception
			System.out.println("business exception");
		}
		if("SYSTEMERROR".equals(s)){
			//system exception
			System.out.println("system exception");
		}
		else{
			//null exception
			System.out.println("null exception");
		}
	
	}
}