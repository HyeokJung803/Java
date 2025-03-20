package exam;

import java.util.Scanner; 

public class Example07 {
	public static void main(String[] args) {
		/*
		 * nextLine()
		 * - 개행을 기준으로 한 줄을 읽어들임
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >>");
		String str = sc.nextLine();
		System.out.println(str);
	}
}
