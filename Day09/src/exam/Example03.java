package exam;

public class Example03 {
	public static void main(String[] args) {
		int i = 2;
		while(i <= 9) {
			int j = 1;
			while(j <= 9) {
				System.out.println(i + "x" + j +"="
						+ i * j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
