package exam;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * continue
		 * - 반목문 안에서 continue 문을 만나면 이후의 
		 * 실행 코드는 수행되지 않고 반복문의 처음으로 돌아가
		 * 반복문을 실행함
		 */
		int i = 0;
		while(i <= 100) {
			i++;
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
