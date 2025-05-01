package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다. \r\n"
				+ "이 숫자를 맞춰주세요");
		int computer = (int)(Math.random() * 100) + 1;
		System.out.println(computer);
		int count = 0;
		while(true) {
			try{
			System.out.println("숫자입력 >>");
			int user = sc.nextInt();
			count++;
			if(user > computer) {
				System.out.println("DOWN");
			} else if(user < computer) {
				System.out.println("UP");
			} else if(user == computer) {
				System.out.println("정답입니다. " + count + "회 만에 맞췄어요");
				break;
			}
		} catch(Exception e ) {
			System.out.println("숫자만 입력가능 다시 입력");
			count++;
			sc.nextLine();
			}
		}
	}
}