package exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 클래스(class)
		 * - 일종의 틀 설계도 이러한 것들을 클래스라고 한다
		 * - 클래스로부터 만들어진 객체를 인스턴트라 한다
		 * * 인스턴트란? new 연산자로 생성된 녀석 !!
		 * 
		 * 객체지향 프로그래밍 개발의 단계
		 * 클래스 설계 > 클래스를 이용한 객체 생성 > 생성된 객체 사용
		 */
		// s1 과 s2는 Student 클래스의 인스턴스
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
