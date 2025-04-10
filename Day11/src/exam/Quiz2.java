package exam;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 주어진 배열의 전체 원소들의 합과 평균 값을 출력하세요.
		 * 
		 * 결과
		 * 합계 : 615
		 * 평균 : 68.3333333..
		 * 
		 */
		int [][] arr = {
				{93,56,43},
				{83,71},
				{96,54,22,97}
		};
		int sum = 0;
		int count = 0;
		double avg = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
				count++;
			}
		}
		avg = (double) sum / count;
		
		System.out.println("결과)");
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
}
