package location;

public class City {
	public String name = "홍길동";
	public String city;
	public String gu;
	public String dong;
	
	// 생성자는 클래스이름과 동일해야 한다 !!
	public City(String a, String b, String c) {
		city = a;
		gu = b;
		dong = c;
	}
	
}
