package exam;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		// 입력받은 값을 배열에 저장
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[4];
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "번째 입력 >> ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
