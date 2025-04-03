package exam;

public class Example04 {
	public static void main(String[] args) {
		int coffee = 10;
		while(true) {
			System.out.println("돈을 받았으니 커피를 준다");
			coffee--;
			System.out.println("남은 커피의 양은 " + coffee + "입니다.");
			
			if(coffee == 2) {
				System.out.println("남은 커피수는 " + coffee + "개라서 내가 마실꺼임 영업종료");
				break;
			}
		}
		
		/*
		 * while문과 for문
		 * 
		 * for문
		 * - 구하고자 하는 값의 조건이 무엇인지 명확할 경우
		 * 사용하는것이 좋다
		 * - 또한 초기값 조건식 증감식이 while문과 달리 블록에서
		 * 바로 찾을 수 있어 가독성이 좋음
		 * 
		 * while문
		 * - 구하고자 하는 값의 조건이 정확하게 모를 경우
		 * 즉 유동적인 경우에 사용하면 좋다
		 * - 조건식이 한곳에 있지 않아 가독성이 나쁘다
		 */
	}
}
