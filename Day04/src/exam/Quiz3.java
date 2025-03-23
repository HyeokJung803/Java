package exam;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 수를 입력받아 그 수의 절대값을 구하세요
		 * 
		 * 입력 >> -5
		 * 출력 : 5
		 * 
		 * 입력 >> 5
		 * 출력 >> 5
		 */
		System.out.println("입력 >>");
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println(-num);
		} else {
			System.out.println(num);
		}
	}
}
