package exam;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * Math.random() 메소드를 이용해서 두 개의 주사위를
		 * 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고
		 * 눈의 합이 오가 아니면 계속 던지고
		 * 눈의 합이 5이면 실행을 멈추는 코드를 작성하세요
		 * 멈추기 전까지의 눈의 형태는 전부 출력되어야 한다 !!
		 */
		while (true) {
			int a = (int) (Math.random() * 6) + 1;
			int b = (int) (Math.random() * 6) + 1;
			int sum = a + b;
			System.out.println(a + "+" + b + "=" + sum);
			if (sum == 5) {
				break;
			}
			
		}
	}
}
