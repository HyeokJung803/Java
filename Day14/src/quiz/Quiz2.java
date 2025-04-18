package quiz;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Phone (String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Phone[] phone = null;
		while(true) {
			System.out.println("실행)");
			System.out.println("1.입력|2.검색|3.프로그램종료");
			System.out.print("메뉴를 선택해주세요 >> ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("인원 수: ");
				int num = sc.nextInt();
				phone = new Phone[num];
				for (int i = 0; i < phone.length; i++) {
					System.out.printf("이름과 전화번호 입력) ");
					String name = sc.next();
					String tel = sc.next();
					phone[i] = new Phone(name, tel);
				}
				break;
			case 2:
				System.out.print("검색할 이름 : ");
				String search_name = sc.next();
				boolean flag = false;
				for(int i = 0; i < phone.length; i++) {
					if(phone[i].getName().equals(search_name)) {
						System.out.println(search_name + "의 번호는"
								+ phone[i].getTel() + "입니다.");
						flag = true;
					}
				}
				if(!flag) {
					System.out.println(search_name + " 이름은 없습니다.");
				}
				break;
			case 3:
				System.out.println("종료");
				break;
			default:
				System.out.println("숫자를 잘못 입력하셨습니다.");
				break;
			}
			if(choice == 3) {
				break;
			}
		}
	}
}

