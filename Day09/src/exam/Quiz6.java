package exam;

import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) {
		/*
		 * 사용자부로부터 양의 정수를 입력받고 그 수만큼
		 * 3의 배수를 출력하는 프로그램을 작성하세요
		 * 
		 * 입력 >> 5
		 * 3 6 7 12 15
		 * 
		 * 입력 >> 7
		 * 3 6 9 12 15 18 21
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >>");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
				System.out.print(3*i +" ");
			}
		
	}
}
