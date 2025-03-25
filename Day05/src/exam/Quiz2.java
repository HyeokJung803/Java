package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		 /*
		  * 연산기호에 따라(덧셈(+) (뺄셈(-) 곱셈(*) 나눗셈(/))
		  * 하는 사칙연산을 하는 프로그램을 작성하세요
		  * 
		  * 숫자입력 >> 3
		  * 기호입력 >> +
		  * 숫자입력 >> 3
		  * 결과 : 6
		  * 
		  * 숫자입력 >> 10
		  * 기호입력 >> %
		  * 숫자입력 >> 5
		  * 기호를 잘못입력하였습니다
		  */
		Scanner sc = new Scanner(System.in);
		//char a = sc.next().charAt(0);
		
		System.out.println("숫자입력");
		int num1 = sc.nextInt();
		
		System.out.println("기호입력");
		char sign = sc.next().charAt(0);
		
		System.out.println("숫자입력");
		int num2 = sc.nextInt();
		
		
		switch(sign) {
		case '+':
			System.out.println("결과:" + (num1+num2));
			break;
		case '-':
			System.out.println("결과:" + (num1-num2));
			break;
		case '*':
			System.out.println("결과:" + (num1*num2));
			break;
		case '/':
			System.out.println("결과:" + (num1/num2));
			break;
		default:
			System.out.println("기호를 잘못입력하였습니다.");
			break;
		}
		
	}
}
