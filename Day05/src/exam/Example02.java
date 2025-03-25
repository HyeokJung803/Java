package exam;

public class Example02 {
	public static void main(String[] args) {
		int kor = 40;
		int eng = 20;
		double avg = (kor + eng) / 2.0;
		
		if (kor < 50 || eng < 50) {
			System.out.println("한 과목이 50점 미만");
			System.out.println("불합격(과락) 입니다.");
		} else if (avg > 70) {
			System.out.println("두 괌고의 평균 점수가 70이상이므로");
			System.out.println("합격입니다.");
		} else {
			System.out.println("두 과목의 평균 점수가 70 미만이므로");
			System.out.println("불합격입니다.");
		}
	}
}
