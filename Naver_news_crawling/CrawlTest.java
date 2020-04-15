package javaTest;

import java.io.*;
import java.util.*;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*
	문제 : 네이버 경제 뉴스 리스트를 크롤링 해온다.
	※ https://news.naver.com/main/list.nhn?mode=LS2D&mid=shm&sid1=101&sid2=263
	※ 네이버 뉴스 경제일반 파트(2페이지까지)
	※ JSOUP 활용
             ※이미지파일은 upload 폴더 밑에 저장(제목은 뉴스타이틀)
*/
public class CrawlTest {
	// 1. URL
	private static String new_URL = "https://news.naver.com/main/list.nhn?mode=LS2D&sid2=263&sid1=101&mid=shm&date=20200415";

	public static void main(String[] args) throws IOException {
		int idx = 0;
		// 페이지 2까지
		for (int i = 1; i <= 2; i++) {
			System.out.println("==========[" + i + "] 페이지==========\n");
			
			// 2. HTML 가져오기(페이지 단위)
			Document doc = Jsoup.connect(new_URL + getParameter(i)).get();
			
			// 3. Element
		    Elements articles = doc.select(".container #main_content.content ul li dl");

		    // 4. 내용 출력
		    for(Element article : articles) {
		    	// 제목
		    	Elements title = article.select("dt a");
		    	System.out.println(++idx + ". " + title.text());
		    	// 내용
		    	Elements contents = article.select("dd .lede");
		    	System.out.println("내용 : " + contents.text());
		    	// 작성자
		    	Elements writing = article.select("dd .writing");
		    	System.out.println("작성 : " + writing.text() + "\n");
		    	
//		    	// 이미지 저장
//		    	Elements imgs = article.select("img"); 
//		    	List<String> imageUrls = new ArrayList<>();
//		    	for(Element img : imgs) {
//		    	    imageUrls.add(img.attr("src"));
//		    	  }
//		    	
//		    	URL url = new URL(imageUrls.toString());
//		    	InputStream in = new BufferedInputStream(url.openStream());
//		    	ByteArrayOutputStream out = new ByteArrayOutputStream();
//		    	byte[] buf = new byte[1024];
//		    	int n = 0;
//		    	while(-1!=(n=in.read(buf))) {
//		    		out.write(buf, 0, n);
//		    	}
//		    	out.close();
//		    	in.close();
//		    	byte[] response = out.toByteArray();
//		
//		    	// 원하는 경로에 이미지 다운로드
//		    	File fileData = new File("C:\\!DevTool\\dev\\Java\\IncoProject\\upload", title.text() + ".png");
//		    	if(!fileData.exists()) {
//		    		FileOutputStream fos = new FileOutputStream("C:\\!DevTool\\dev\\Java\\IncoProject\\upload\\" + title.text() + ".png");
//		    		fos.write(response);
//		    		fos.close();
//		    	}
		    }
		}
	}
	
	public static String getParameter(int PAGE) {
		return "&page=" + PAGE;
	}
}
