package exam;

import java.util.ArrayList;
import java.util.List;

public class Example05 {
	public static void main(String[] args) {
		List<Integer> randomList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			int temp = (int)(Math.random() * 30 ) + 1;
			randomList.add(temp);
		}
		
		System.out.println("전체데이터 : " + randomList);
		
		for(int i = 0; i < randomList.size(); i++) {
			Integer value = randomList.get(i);
			if(value % 2 == 0) {
				System.out.println(value);
			}
		}
	}
}
