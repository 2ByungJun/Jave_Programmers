package book;

public class Book {
	
	protected int id; // 식별자
	protected String isbn; // ISBN 번호
	protected String name; // 책 제목
	protected String manual; // 상품 설명
	protected int price; // 가격 정보
	
	public Book(int id, String isbn, String name, String manual, int price) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.name = name;
		this.manual = manual;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManual() {
		return manual;
	}

	public void setManual(String manual) {
		this.manual = manual;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void show() {
		System.out.println("-----------------------------------");
		System.out.println("식별자 : " + getId());
		System.out.println("ISBN번호 : " + getIsbn());
		System.out.println("책 제목 : " + getName());
		System.out.println("상품 설명 : " + getManual());
		System.out.println("가격 정보 : " + getPrice());
	}

}
