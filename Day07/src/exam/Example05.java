package exam;

public class Example05 {
	public static void main(String[] args) {
		// 1부터 100까지 짝수만 출력하도록!!
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
