package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.println("숫자입력 >> ");
			int num = sc.nextInt();
			sum = sum + num;
			if(num == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("총합: " + sum);
			
		}
		
	}
}
