package exam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * Map
		 * - key(키), value(값)으로 구분하여 데이터를 저장하는 방식
		 * - 키값은 중복이 불가능 value 값은 중복이 가능
		 * - map에 데이터를 찾을 때 해당 키값에 접근하여 그 키값에
		 * 대한 value 값을 얻는 방식
		 * - HashMap은 List와 달리 데이터의 순서를 보장하지 않음
		 * - HashMap의 순서를 보장하고 싶은 경우
		 * LinkedHashMap을 활용하면 된다 !!
		 */
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "사과");
		map.put("banana","바나나");
		map.put("grape","포도");
//		System.out.println(map);
		
		while(true) {
			System.out.println("찾을단어 >> ");
			String find_word = sc.next();
			if(find_word.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			String word = map.get(find_word);
			if(word == null) {
				System.out.println(find_word +
						"는 없는 단어입니다.");
			} else {
				System.out.println(word);
			}
		}
	}
}
