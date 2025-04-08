package exam;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 4 X 4의 2차원 배열을 만들고 이 배열에
		 * 1 ~ 10까지의 정수를 랜덤하게 생성하여
		 * 정수 16개를 배열에 저장하고 2차원 배열을 화면에
		 * 출력하세요
		 */
		int arr[][] = new int [4][4];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10) + 1;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
	}
}
