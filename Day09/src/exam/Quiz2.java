package exam;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 2단부터 9단까지 구구단을 출력하되
		 * 짝수단은 정순으로 출력하고
		 * 홀수단은 역순으로 출력하세요
		 * 
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * ...
		 * 
		 * 3 X 9 = 27
		 * 3 X 8 = 24
		 *...
		 */
		for(int i = 2; i <= 9; i++) {
			if (i % 2 == 0) {
				for(int j = 1; j <= 9; j++) {
					System.out.println(i + "x" + j + "="
							+ i*j);
				} 
			} else {
				for(int o = 9; o >= 1; o--) {
					System.out.println(i + "x" + o + "="
							+ i*o);
				}
				
			}
			System.out.println();
		}
	}
}
