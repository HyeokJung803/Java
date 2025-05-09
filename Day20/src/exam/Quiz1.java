package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 숫자 6개를 입력받아 이를 오름차순으로 정렬하는
		 * 프로그램을 작성하세요
		 * 단) 숫자는 중복하지 않습니다
		 * 
		 * 입력 >> 5 5 2 3 4 1
		 * 출력 >> 1 2 3 4 5
		 */
		
		// 1. 리스트 안에 입력한 데이터 넣기
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 6; i++) {
			System.out.println("입력 >> ");
			list.add(sc.nextInt());
		}
		// list 정렬 기본적으로 오름차순 정렬함
		Collections.sort(list);
		// 2. 리스트 정렬 후 list의 데이터를 중복값을 제거
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(Integer item : list) {
			hashSet.add(item);
		}
		System.out.println(hashSet);
	}
}
