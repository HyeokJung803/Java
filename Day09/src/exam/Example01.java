package exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 중첩반복문
		 * - 바깥쪽 반복문
		 * - 안쪽 반복문
		 * 
		 * 형식)
		 * for(초기식; 조건식; 증감식) {
		 * 		for(초기식; 조건식; 증감식) {
		 * 		}
		 * }
		 */
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "="
						+ i*j);
			}
		}
	}
}
