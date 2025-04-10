package exam;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 길이가 10인 배열을 선언하고 1 ~ 10까지 반목문을 이용하여
		 * 역순으로 배열에 넣은 후 그 값을 출력하세요!!
		 */
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for(int i = 9; i > -1; i--) {
			System.out.println(arr[i]);
		}
	}
}
