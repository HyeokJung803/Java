package exam;

import java.util.HashMap;
import java.util.Hashtable;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * HashMap, Hashtable
		 * 
		 * HashMap : 단일스레드 환경에서 사용하기 좋은 자료구조
		 * Hashtable : 멀티스레드 환경에서 사용하기 좋은 자료구조
		 * 
		 * HashMap은 null을 허용
		 * Hashtable은 null을 허용하지 않는다
		 */
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("apple", null);
		map1.put(null, "banana");
		System.out.println(map1);
		
		Hashtable<String, String> map2 = 
				new Hashtable<String, String>();
		
		map2.put("apple", null);
		map2.put(null, "banana");
	}
}
