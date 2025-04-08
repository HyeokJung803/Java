package exam;

public class Quiz1 {
	public static void main(String[] args) {
		int arr[] = {80,50,25,11,23,41,800,100};
		
		//arr 배열에서 짝수들만 출력하세요 !!
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
			
		}
	}
}
