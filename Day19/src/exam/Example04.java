package exam;

import java.util.ArrayList;
import java.util.List;

public class Example04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//삽입
		list.add("사과");
		list.add("딸기");
		list.add("바나나");
		System.out.println(list);
		list.add("포도");
		System.out.println(list);
		
		/*
		 * 데이터 삽입을 원하는 위치에 기존 데이터가 존재하면
		 * 기존 데이터는 뒤로 이동하고 새로운 데이터가 그 자리에 추가됨
		 */
		list.add(1, "체리");
		System.out.println(list);
		
		/*
		 * 삭제
		 * - ArrayList의 데이터 삭제는 단지 데이터만 삭제되는게
		 * 아닌 값이 있던 공간까지 삭제됨, 배열의 경우 공간을 삭제할 수
		 * 없지만 ArrayList는 원하는 위치의 공간을 삭제할 수 있고
		 * 뒤에 데이터들이 앞으로 이동한다
		 */
		list.remove(2);
		System.out.println(list);
		list.remove("바나나");
		System.out.println(list);
		
		list.add("체리");
		list.add("체리");
		System.out.println(list);

		/*
		 * 만약 중복된 데이터라면 리스트를 순회하며 제일 처음 윛한
		 * 인덱스에 저장되어 있는 값을 찾아 삭제
		 */
		list.remove("체리");
		System.out.println(list);

		// 값 수정
		list.set(2, "파인애플");
		System.out.println(list);
	
		//리스트 안에 있는 값들을 전부 삭제
		list.clear();
		System.out.println(list);

	}
}
