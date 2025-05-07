package exam;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 1 ~ 100 까지 8을 포함하지 않는 수는 몇개인지 출력하고
		 * 그 해당 숫자를 출력하세요
		 */
		int count = 0;
		String str = "";
		for(int i = 1; i <= 100; i++) {
			str = String.valueOf(i);
			if(!str.contains("8")) {
				System.out.printf("%s ", str);
				count++;
			}
		}
		System.out.println();
		System.out.println("8을 포함하지 않는 수의 개수 : " + 
					count);
	}
}
