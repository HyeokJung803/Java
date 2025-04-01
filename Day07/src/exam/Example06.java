package exam;

public class Example06 {
	public static void main(String[] args) {
		/*
		 * 1부터 10까지 모든 수 합계
		 */
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("1 ~ 10까지 합계: " + sum);
	}
}

