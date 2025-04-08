package exam;

public class Example05 {
	public static void main(String[] args) {
		char[] cards = {'1', 'L', 'O', '2', 'V', '3', 'E'};
		
		for(int i = 0; i < cards.length; i++) {
			if(cards[i] >= 65 && cards[i] <= 90) {
				System.out.printf("%c", cards[i]);
			}
		}
	}
}
