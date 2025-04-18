package quiz;

import java.util.Scanner;

class MethodTest {
	public int getsum(int num1, int num2) {
		return num1 + num2;
	}
	public int getsum(int num1, int num2, int num3) {
		return num1 + num2;
	}
}

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 오버로딩과 오버라이딩
		 * 오버로딩
		 * - 메소드의 이름은 같고 매개변수의 유형 개수를 다르게 설정하는 것
		 * - 생성자 오버로딩, 메소드 오버로딩 !!
		 * 
		 * 오버라이딩
		 * - 상위클래스가 가진 메소드를 자식클래스에서 재정의 하여 사용하는 것
		 * 즉) 메소드의 기능만 변경하여 작성
		 */
		Scanner sc = new Scanner(System.in);
		MethodTest test = new MethodTest();
		System.out.println("숫자입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int num2 = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int num3 = sc.nextInt();
		
		System.out.println(test.getsum(num1, num2));
		System.out.println(test.getsum(num1, num2, num3));
	}
}
