package test2;

import test1.Test1;

public class TestMain2 {
	public static void main(String[] args) {
		Test1 test = new Test1();
		
		// public 접근
		test.Public_name = "홍길동";
		System.out.println(test.Public_name);
		
		// protected 접근
		//test.protected_name = "김길동";
		//System.out.println(test.protected_name);
		
		// default 접근
		//test.default_name = "홍길순";
		//System.out.println(test.default_name);
		
		//private 접근
		test.setPrivate_name("윤준형");
		System.out.println(test.getPrivate_name());
	}
}
