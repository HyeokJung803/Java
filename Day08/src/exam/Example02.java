package exam;

public class Example02 {
	public static void main(String[] args) {
		/*
		 * 무한루프
		 * - 말 그대로 무한히 반복됨
		 * - 루프를 탈출할려면 루프내에서 탈출조건을 걸어줘야 한다
		 */
		int i = 0;
		while(true) {
			if(i == 30) {
				break;
			}
			i++;
			System.out.println(i);
		}
		
		
	}
}
