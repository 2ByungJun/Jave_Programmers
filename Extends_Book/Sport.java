package book;

public class Sport extends Magazine{

	private String web; // 웹 페이지 연동 정보

	public Sport(int id, String isbn, String name, String manual, int price, String pubDay, String web) {
		super(id, isbn, name, manual, price, pubDay);
		this.web = web;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}
	
	public void showSport() {
		showMagazine();
		System.out.println("(추가)웹 링크  : " + getWeb());
	}
}
