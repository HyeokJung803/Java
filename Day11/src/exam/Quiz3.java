package exam;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		arr[0] = 1;
		arr[1] = 1;
	
		for (int i = 0; i < arr.length; i++) {
			if(i == 0 || i == 1) {
				continue;
			}
			arr[i] = arr[i-1] + arr[i-2];
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
