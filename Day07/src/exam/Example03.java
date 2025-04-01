package exam;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * 1 ~ 10 까지 역순으로 출력
		 * 초기식을 10으로 초기화 하고 조건식을 0보다 클때까지 
		 * 반복문을 실행하도록 조건식을 설정한다
		 * 그리고 루프 돌면서 i의 값을 1씩 감소시키도록 한다!
		 */
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
	}
}
