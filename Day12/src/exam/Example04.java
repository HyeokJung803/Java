package exam;

public class Example04 {
	/*
	 * Getter와 Setter 메소드
	 * - 객체 지향 프로그래밍에서 객체의 데이터는 객체 외부에서
	 * 직접적으로 접근하는 것을 막는다
	 * - 객체의 데이터를 외부에서 마음대로 읽고 변경할 경우
	 * 객체의 무결성이 깨짐
	 * 
	 * 객체의 무결성을 유지하기 위해 메소드를 통해 데이터를 변경하게
	 * 하여 검증된 값만 데이터로 저장할 수 있게 한다 => setter 메소드
	 * 
	 * private으로 선언한 필드의 값을 호출할려면 => getter 메소드
	 */
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();

		book1.setTiltle("자바의 정석");
		book1.setAuthor("남궁성");
		book2.setTiltle("열혈 C프로그래밍");
		book2.setAuthor("윤성우");
		
		System.out.println(book1.getTiltle());
		System.out.println(book1.getAuthor());
		System.out.println(book2.getTiltle());
		System.out.println(book2.getAuthor());
	}
}
