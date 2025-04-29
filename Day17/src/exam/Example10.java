package exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//다중 예외 처리 !!
		try {
			System.out.println("숫자 입력 >> ");
			int num1 = sc.nextInt();
			System.out.println("숫자 입력 >> ");
			int num2 = sc.nextInt();
			System.out.println(num1 / num2);
		} catch(ArithmeticException e ) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(InputMismatchException e) {
			System.out.println("숫자만 입력 가능합니다.");
		}
	}
}
