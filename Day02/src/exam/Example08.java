package exam;

public class Example08 {
	public static void main(String[] args) {
		/*
		 * 실수형(float, double)
		 * 
		 * 크기가 작은것 : float (4byte)
		 * 크기가 큰것: double (8byte)
		 * 
		 * float는 소수점 7자리 까지 정확하게 표현되며
		 * double은 소수점 15자리까지 정확하게 표현됨
		 * 컴퓨터는 실수를 가지고 수행하는 모든 연산에는
		 * 작은 오차가 존재한다 자바뿐 아니라 모든 프로그래밍
		 * 언어에서 발생하는 기본적인 문제
		 */
		double marathon = 42.195;
		// float형은 반드시 뒤에 f 혹은 F를 붙혀야함
		float halfMarathon = 21.0975f;
		
		System.out.println("마라토은 " + marathon + 
				"km를 달린다.");
		System.out.println("하프 마라톤은 " + halfMarathon + 
				"km를 달린다.");
		
		double pipDouble = 3.141592653589793;
		float pipFloat = 3.141592653589793F;
		System.out.println(pipDouble);
		System.out.println(pipFloat);
	}
}
