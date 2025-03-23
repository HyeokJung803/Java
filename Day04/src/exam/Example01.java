package exam;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 3자리 정수를 입력받아 백의 자리 이하를 버리는 코드
		 * 를 작성하세요
		 * 예를 들어 입력받은 값이 456이라면 400이 되고
		 * 111이라면 100이 됩니다.
		 */
		System.out.println("입력 >>");
		int num = sc.nextInt();
		int result = num / 100 * 100;
		System.out.println(result);
		/*
		 * 원화를 입력받아 달러로 바꾸는 프로그램을 작성하세요
		 * $1 = 1100원으로 가정하세요 !
		 * 
		 * 원을 입력하세요 >> 3300
		 * 3300원은 $3.0 입니다.
		 */
		System.out.println("원을 입력하세요 >>");
		int money = sc.nextInt();
		double dollar = money / 1100;
		System.out.println(money + "원은 $" + dollar
							+ "입니다");
	}
}
