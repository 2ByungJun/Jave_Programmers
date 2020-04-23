package book;

public class Magazine extends Book{

	private String pubDay; // 발행 주기

	public Magazine(int id, String isbn, String name, String manual, int price, String pubDay) {
		super(id, isbn, name, manual, price);
		this.pubDay = pubDay;
	}

	public String getPubDay() {
		return pubDay;
	}

	public void setPubDay(String pubDay) {
		this.pubDay = pubDay;
	}
	
	public void showMagazine() {
		show();
		System.out.println("(추가)사은품 정보 : " + getPubDay());
	}
}
