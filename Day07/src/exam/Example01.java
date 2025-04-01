package exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 반복문이란
		 * - 프로그램 내에서 똑같은 명령을 일정 횟수만큼
		 * 반복하여 수행하도록 제어하는 코드
		 * - for, while, do ~ while
		 * 
		 * 형식)
		 * for(초기식; 조건식; 증감식) {
		 * 		실행문장..
		 * }
		 * 
		 * 1. 초기식 실행
		 * 2. 조건식 실행
		 * 3. for 블럭안에 실행문 실행
		 * 4. 증감식 실행
		 * 5. 증감식 실행 후 조건식에 부합한지 판별
		 * 6. 만약 조건식이 참이라면 블럭안에 실행문 실행
		 * 7. 만약 조건식이 거짓이라면 반목문 종료
		 */
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello World " + i + "번");
		}
	}
}
