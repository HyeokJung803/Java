package exam;

public class Student {
	// 클래스 구성요소 필드(멤버변수), 생성자, 메소드
	
	// 필드(field) : 객체의 데이터가 저장된다
	String name;
	
	// 생성자(Constructor) : 객체 생성시 초기화 역할
	// new 연산자로 객체가 생성될 때 호출된다. 클래스 이름으로
	// 되어 있고 반환타입이 없다
	Student() {
		
	}
	// 메소드(Method) : 객체의 행위에 해당한다
	void study() {
		System.out.println("공부한다..");
	}
}
