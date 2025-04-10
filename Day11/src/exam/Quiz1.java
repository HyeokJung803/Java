package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = null;
		while(true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생 수 |2.점수 입력 |3.점수 확인 |4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("메뉴입력 >> ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.print("학생 수: ");
				int students = sc.nextInt();
				score = new int [students];
				break;
			case 2:
				System.out.println("[ 학생들의 점수 입력 ]");
				for (int i = 0; i < score.length; i++) {
					System.out.printf(i + 1 + ")번째 학생 점수: ");
					score[i] = sc.nextInt();
				}
				break;
			case 3:
				System.out.println("[ 학생들의 점수 확인 ]");
				for (int i = 0; i < score.length; i++) {
					System.out.println(i + 1 + ")번 학생 점수: " + score[i]);
				}
				break;
			case 4:
				System.out.println("[ 학생들의 점수 분석 ]");
				int total = 0;
				int max = score[0];
				int min = score[0];
				for (int i = 0; i < score.length; i++) {
					// 루프를 돌면서 max값과 요소에 저장되어
					// 있는 값을 비교한다 만약 요소에 저장되어
					// 있는 값이 크다면
		            if (score[i] > max) {
		                max = score[i]; // max 변수에 요소에 있는 값을 저장
		            }
		            if (score[i] < min) {
		                min = score[i];
		            }
		            total = total +score[i]; 
		        }
				double avg = (double) total / score.length;
				System.out.println("최고 점수 : " + max);
				System.out.println("최소 점수 : " + min);
				System.out.println("평균 점수 : " + avg);
				break;
			case 5:
				System.out.println("종료");
				break;
			default:
				System.out.println("숫자를 잘못 입력하셨습니다.");
				break;
			}
			if(num == 5) {
				break;
			}
		}
	}
}
