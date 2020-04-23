package book;

public class Main {

	static int id = 1;
	static String name = "이 선이 필요할까?";
	static String isbn = "9791188867431";
	static String manual = "마냥 즐겁게 놀던 아이들은 갑자기 나타난 선을 보고 당황했다 ... 이 선 끝에는 무엇이 있는지 궁금했는데….";
	static int price = 12600;
	static String gift = "700원(5%) + 멤버십(3~1%)";
	static String pubDay = "2020-03-06";
	static String web = "https://www.aladin.co.kr/shop/wproduct.aspx?ItemId=234522129&start=we";
	static String writing = "차재혁(지은이)";
	static String type = "국내도서 > 어린이 > 초등1~2학년 > 그림책";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book(id,  isbn,  name,  manual,  price);
		Hobby hobby = new Hobby( id,  isbn,  name,  manual,  price,  gift);
		Magazine magazine = new Magazine(id,  isbn,  name,  manual,  price, pubDay ); 
		Novel novel = new Novel(id,  isbn,  name,  manual,  price, writing, type);
		Sport sport = new Sport(id,  isbn,  name,  manual,  price, pubDay, web );
		
		book.show();
		hobby.showHobby();
		magazine.showMagazine();
		novel.showNovel();
		sport.showSport();
	}
}
