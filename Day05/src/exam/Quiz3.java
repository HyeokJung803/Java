package exam;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 *자신의 몸무게와 키를 입력받고
		 *BMI가 저체중인지, 정상인지, 과체중인지, 비만인지
		 *판별하는 프로그램을 작성하세요
		 *
		 * BMI가 18.5 아래면 저체중
		 * BMI가 18.5 ~ 22.9 사이면 정상
		 * BMI가 23.0 ~ 24.9 사이면 과체중
		 * BMI가 25.0 이상부터는 비만
		 * BMI 공식) 몸무게(KG) / (신장(M) * (신장(M))
		 * 
		 * 몸무게와 키는 실수타입으로 입력받도록 하고
		 * cm => M 변환하는 법
		 * 1cm = (1/100)
		 * 872.5cm => 872.5 / 100 = 8.725
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("몸무게를 입력");
		double kg = sc.nextDouble();
		System.out.println("키를 입력");
		
		double cm = sc.nextDouble();
		double m = cm / 100;
		
		double BMI = kg / (m * m);
		
		System.out.println("당신의 BMI는" + BMI + " 입니다.");
		if (BMI < 18.5) {
			System.out.println("저체중입니다.");
		} else if (BMI >= 18.5 && BMI <= 22.9) {
			System.out.println("정상입니다.");
		} else if (BMI >= 23.0 && BMI <= 24.9) {
			System.out.println("과체중입니다.");
		} else {
			System.out.println("비만입니다.");
		}
	}
}
