package exam;

public class Example01 {
	public static void main(String[] args) {
		System.out.printf("%d\n", 10);
		int num1 = 100;
		System.out.printf("%d\n", num1);
		
		int num2 = 200; int num3 = 300;
		// 2가지 이상 서식문자를 이용해 데이터 출력
		System.out.printf("%d %d %d", num1, num2, num3);
		
		System.out.println();
		
		/*
		 * 지정한 숫자만큼 공간을 확보한 후 오른쪽 정렬하여 
		 * 출력하는 예시
		 */
		System.out.printf("%3d\n", 10);
		System.out.printf("%5d\n", 10);
		System.out.printf("%10d\n", 10);
	}
	
	
}
