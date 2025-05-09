package exam;

import java.util.HashMap;

public class Example04 {
	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap = 
				new HashMap<String, Integer>();
		
		// 5개의 점수 저장
		scoreMap.put("홍길동", 97);
		scoreMap.put("홍길순", 88);
		scoreMap.put("홍길영", 89);
		scoreMap.put("김길동", 70);
		scoreMap.put("김길순", 50);
		
		System.out.println("HashMap의 요소 개수 : " + 
					scoreMap.size());
		System.out.println("학생들의 점수");
		/*
		 * scoreMap의 ketSet 메소드를 활용하여 저장되어 있는 모든
		 * Key를 불러옴 루프를 돌며 해당 키를 가지고 그 키에 대한
		 * value 값을 불러올 수 있음 !!
		 */
		for(String key : scoreMap.keySet()) {
			Integer value = scoreMap.get(key);
			System.out.println(key + " : " + value);
		}
		
	}
}