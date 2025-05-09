package exam;

import java.util.LinkedList;

public class Example02 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		System.out.println(list);
		
		list.addFirst(100); // 리스트의 가장 앞에 데이터 추가
		list.addLast(200); // 리스트의 가장 뒤에 데이터 추가
		System.out.println(list);
		
		// 링크드 리스트는 데이터를 추가할 때 기존에 연결된 링크를
		// 끊고 해당 노드에 새로 주소를 연결한다
		list.add(1,150);
		System.out.println(list);
		
		// 값 삭제
		list.remove(1); // 1번째 인덱스 제거
		System.out.println(list);
		
		// 값 수정
		list.set(0, 1000);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		/*
		 * 언제 ArrayList를 사용하면 좋고 언제 LinkedList를 사용하면
		 * 좋을까??
		 * - 요소의 추가, 삭제, 검색등의 작업에 따라 성능이 다름
		 * - 요소의 추가 삭제가 자주 발생할 경우 LinkedList를 사용
		 * - 요소의 접근이 자주 필요한 경우는 ArrayList를 사용 하면 좋음
		 */
	}
		
}
