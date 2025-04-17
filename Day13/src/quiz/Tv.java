package quiz;

public class Tv {
	public String company;
	public int year;
	public int size;
	
	public Tv (String company, int year, int size) {
		this.company = company;
		this.year = year;
		this.size = size;
	}
	public void show() {
		System.out.println(this.company + "에서 만든 " + this.company + "년형 " 
				+ this.size + "인치 TV");
	}
}
