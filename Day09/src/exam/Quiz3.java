package exam;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 중첩 for 문을 이용해서 4x +  5y = 60의 모든
		 * 해를 구해서(x,y) 형태로 출력하세요
		 * 단 x,y는 10이하 자연수 입니다.
		 * 
		 * 답)
		 * (5, 8)
		 * (10, 4)
		 */
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				if((4 * x) + (5 * y) == 60)
					System.out.println("("+ x +","
							+ y +")");
			}
		}
	}
}
