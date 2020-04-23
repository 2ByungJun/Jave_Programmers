package book;

public class Hobby extends Book{
	
	private String gift; // 사은품 정보

	public Hobby(int id, String isbn, String name, String manual, int price, String gift) {
		super(id, isbn, name, manual, price);
		this.gift = gift;
	}

	public String getGift() {
		return gift;
	}

	public void setGift(String gift) {
		this.gift = gift;
	}
	
	public void showHobby() {
		show();
		System.out.println("(추가)사은품 정보 : " + getGift());
	}
}
