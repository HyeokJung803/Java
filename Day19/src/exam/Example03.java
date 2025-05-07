package exam;

import java.util.ArrayList;
import java.util.List;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * List
		 * - List는 배열과 유사한 자료구조로 중복이 허용되면서
		 * 저장 순서가 유지되는 구조
		 * - 배열과의 차이점은 크기에 제한이 없고 삽입 삭제 수정이 
		 * 용이함
		 * - List 컬렉션은 List 인터페이스를 생성하여 기능을 정의하고
		 * 하위 클래스에 상속해 그 기능을 구현하도록 한다
		 * 
		 * List<Obj> list = new ArrayList();
		 * Obj : 리스트에 저장할 데이터 유형(기본 타입을 명시하는 것이
		 * 아닌 기본 자료형을 객체화 시킨 Wrapper 클래스를 명시할 것)
		 * 
		 */
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		System.out.println(list1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("사과");
		list2.add("딸기");
		list2.add("바나나");
		System.out.println(list2);
		
		/*
		 * 1. List<> list = new ArrayList<>()
		 * 2. ArrayList<> list = new ArrayList<>()
		 * 
		 * - List는 인터페이스고 ArrayList는 이 List를 구현한
		 * 클래스임 그러므로 List로 선언을 한 경우 인스턴스를
		 * ArrayList로 받을 수 있고 LinkedList로도 받을 수 있다
		 * 단) 2번째 방법으로 선언한 경우 ArrayList의 인스턴스를
		 * 만들어야 하므로 ArrayList로 객체를 생성해야 한다
		 */
	}
}
