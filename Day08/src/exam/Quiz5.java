package exam;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cash = 0;
		int pluscash = 0;
		int minuscash = 0;
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.예금 |2.출금 |3.잔금 |4.종료");
			System.out.println("----------------------------");
			System.out.print("메뉴입력 >> ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.print("예금액: ");
				pluscash = sc.nextInt();
				cash = cash + pluscash;
				break;
			case 2:
				System.out.print("출금액: ");
				minuscash = sc.nextInt();
				if (minuscash > cash) {
					System.out.println("잔금이 부족합니다.");
				} else {
					cash = cash - minuscash;
				}
				break;
			case 3:
				System.out.println("잔금: " + cash);
				break;
			case 4:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("숫자를 잘못 입력하셨습니다.");
				break;
			}
			if(num == 4) {
				break;
			}
		}
	}
}
