package book;

public class Comic extends Book{
	
	public boolean isColor;
	
	public Comic(String title, String author) {
		super(title, author);
	}
	
	//void info_tilte( ) {
		
	//}
	void info_author() {
		System.out.println("이 만화책의 저자는 "  
						+ author + "입니다");
	}
	void info_color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러입니다.");
		} else {
			System.out.println("이 만화책은 흑백입니다.");
		}
	}
}
