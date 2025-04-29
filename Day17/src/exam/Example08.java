package exam;

public class Example08 {
	public static void main(String[] args) {
		/*
		 * 에러(Error)와 예외(Exception) 차이
		 * 
		 * 에러(Error)
		 * - 시스템이 종료되어야 할 수준의 상황과 같이 수습할 수 없는
		 * 심각한 문제를 의미
		 * 
		 * 예외(Exception)
		 * - 개발자가 구현한 로직에서 발생한 실수나 사용자의 영향에 의해
		 * 발생한다
		 * - 자바는 객체지향 언어이기 때문에 프로그램에서 발생하는 예외들을
		 * 클래스의 형태로 제공한다
		 * - 예외는 체크예외(Check exception)와
		 * 비체크 예외(Unchecked exception) 두 가지가 있다
		 * 
		 * 체크예외 : 파일입출력(IOException), db연동(SQLException)
		 * 비체크예외 : 위 두가지 제외하고 전부
		 */
		try {
			// try 블럭안에 예외가 발생할 수 있는 코드를 명시
			System.out.println(4/0);
		} catch(ArithmeticException e) {
			// catch 블럭안에 예외 발생시 처리할 코드 명시
			System.out.println("0으로 나눌 수 없습니다.");
		}
		try {
			System.out.println(5 / 0);
		} catch (Exception e) {
			// TODO: handle exception
			// Exception 클래스는 모든 예외를 처리한다 !!
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
