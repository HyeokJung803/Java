package exam;

import java.util.Scanner;

public class Quiz1 {
          public static void main(String[] args) {
			/*
			 * 세 정수를 입력받아 입력받은 수 중 짝수만 출력하세요
			 * 실행예시)
			 * 입력 >> 3 2 7
			 * 결과 >> 2
			 * 
			 * 입력 >> 2 1 4
			 * 결과 >> 2 4
			 */
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 >>");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        if (num1 % 2 == 0) {
        	System.out.println(num1);
        }
        if (num2 % 2 == 0) {
        	System.out.println(num2);
        }
        if (num3 % 2 == 0) {
        	System.out.println(num3);
        }
        
        
		}
}
