package javaTest;

import java.io.*;
import java.util.*;
import java.net.*;
import java.text.SimpleDateFormat;

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
	private static String new_URL = "https://news.naver.com/main/list.nhn?mode=LS2D&sid2=263&sid1=101&mid=shm";

	public static void main(String[] args) throws IOException, MalformedURLException {
		int idx = 0;
		// 페이지 2까지
		for (int i = 1; i <= 2; i++) {
			System.out.println("==========[" + i + "] 페이지==========\n");

			// 2. HTML 가져오기(페이지 단위)
			Document doc = Jsoup.connect(new_URL + getParameter(i)).get();

			// 3. Element
			Elements articles = doc.select(".container #main_content.content ul li dl");

			// 4. 내용 출력
			for (Element article : articles) {
				// 제목
				Elements title = article.select("dt a");
				System.out.println(++idx + ". " + title.text());
				// 내용
				Elements contents = article.select("dd .lede");
				System.out.println("내용 : " + contents.text());
				// 작성자
				Elements writing = article.select("dd .writing");
				System.out.println("작성 : " + writing.text() + "\n");

				// 이미지 저장
				Elements imgs = article.select("img");
				CrawlTest getImage = new CrawlTest();
				for(Element k : imgs) {
					String url = k.getElementsByAttribute("src").attr("src");
					try {

						getImage.saveImage(url, title.text());

					} catch (IOException e) {

						e.printStackTrace();

					}
					
				}
			}
		}
	}

	// 페이지, 날짜 파라미터
	public static String getParameter(int PAGE) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar c1 = Calendar.getInstance();
		String strToday = sdf.format(c1.getTime());

		return "&date=" + strToday +"&page=" + PAGE;
	}

	// 이미지 폴더 저장
	private void saveImage(String imageUrls, String title) throws IOException {

		URL url = null;
		InputStream in = null;
		OutputStream out = null;

		try {

			url = new URL(imageUrls);

			in = url.openStream();

			out = new FileOutputStream("C:\\!DevTool\\dev\\Java\\IncoProject\\upload\\" + fix_title(title)  + ".jpg"); // 저장경로
			
			while (true) {
				// 이미지를 읽어온다.
				int data = in.read();
				if (data == -1) {
					break;
				}
				// 이미지를 쓴다.
				out.write(data);

			}

			in.close();
			out.close();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}

		}
	}
	
	// 특수문자 제거
	public static String fix_title(String title) {
		String pattern = title.replace("?", ".").replace("/", ".").replace("<", "(").replace(">", ")").replace("|", ".").replace("\"", "'");
		return pattern;
	}
}
