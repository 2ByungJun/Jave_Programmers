package book;

public class Novel extends Book{

	private String writing; // 저자
	private String type; // 장르
	
	public Novel(int id, String isbn, String name, String manual, int price, String writing, String type) {
		super(id, isbn, name, manual, price);
		this.writing = writing;
		this.type = type;
	}

	public String getWriting() {
		return writing;
	}

	public void setWriting(String writing) {
		this.writing = writing;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void showNovel() {
		show();
		System.out.println("(추가)저자  : " + getWriting());
		System.out.println("(추가)장르  : " + getType());
	}

}
