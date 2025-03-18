package exam;

public class Example05 {

	public static void main(String[] args) {
		/*
		 * 서식문자 
		 * %d : 정수(10진수)
		 * %o : 정수(8진수)
		 * %x : 정수(16진수)
		 * %f : 실수
		 * %e : 지수(e표시기반)
		 * %g : 출력 대상에 따라 %e 또는 %f 형태로 출력
		 * %s : 문자열
		 * %c : 문자
		 * 
		 * 제어문자
		 * \n : 개행문자
		 * \t : 수평 탭
		 * \b : 백스페이스 바로 앞의 문자를 지움
		 */
		
		// 정수 출력
		System.out.printf("%d\n", 10);
		System.out.printf("%d\n", 100);
		
		// 2가지 이상의 서식 문자를 이용해 데이터 출력
		System.out.printf("%d 첫번째, %d 두번째, %d 세번째", 10,20,30);
		System.out.println();
		int age = 31;
		System.out.printf("저의 나이는 %d 살입니다", age);

	}

}
