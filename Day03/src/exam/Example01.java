package exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 형 변환
		 * - 자료형을 다른 자료형으로 변환하는 것
		 * - 연산을 하기 위해서는 같은 자료형끼리만 수행 가능
		 * - 서로 다른 자료형의 연산을 수행하기 위해서는 같은
		 * 자료형으로 변환해야한다
		 */
		int num1 = 11;
		double num2 = 3.14;
		
		double result = num1 + num2;
		int result1 = num1 + (int) num2;
		
		System.out.println("덧셈결과1 : " + result);
		System.out.println("덧셈결과2 : " + result1);

		
	}

}
