package javaTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
문제 : 2017-2018 K리그팀들의 규칙에 따른 승점과 순위를 구하시오.
※ 규칙에 따르면 경기에서 이긴 팀은 3점을 얻고 비기면 1을 지면 0점을 받는다.
※ (첨부된 2018K리그 엑셀 파일 리스트를 불러와서 구현)->API 활용(POI)

결과 예)  팀 = 대구 ,승점 = 101 순위= 1
                 팀 = 울산  ,승점 =94 순위=  2
                 팀 = 서울  ,승점 =68 순위=  3
                 팀 = 수원  ,승점 =48 순위=  4
                 팀 = 전북  ,승점 =41 순위=  5
   ...
*/
public class ExcelLoadTest {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream file = new FileInputStream("C:\\!DevTool\\dev\\Java\\IncoProject\\2018K리그.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			Map<String, Integer> map = new HashMap<>();

			int rowindex = 0;
			int columnindex = 0;
			// 시트 수 (첫번째에만 존재하므로 0을 준다)
			// 만약 각 시트를 읽기위해서는 FOR문을 한번더 돌려준다
			XSSFSheet sheet = workbook.getSheetAt(0);

			// 행의 수
			int rows = sheet.getPhysicalNumberOfRows();
			for (rowindex = 1; rowindex < rows; rowindex++) {
				// 행을읽는다
				XSSFRow row = sheet.getRow(rowindex);

				if (row != null) {
					// 셀의 수
					int cells = row.getPhysicalNumberOfCells();
					String team = "";
					Integer score = 0;
					Integer sum = 0;
					for (columnindex = 0; columnindex <= cells; columnindex++) {
						// 셀값을 읽는다
						XSSFCell cell = row.getCell(columnindex);
						// 셀이 빈값일경우를 위한 널체크
						if (cell == null) {
							continue;
						} else {
							switch (cell.getCellType()) {
							// 문자열
							case XSSFCell.CELL_TYPE_STRING:
								team = cell.getStringCellValue() + "";
								break;
							// 숫자
							case XSSFCell.CELL_TYPE_NUMERIC:
								sum = (int) cell.getNumericCellValue();
								if (columnindex == 2)
									score = sum * 3;
								if (columnindex == 3)
									score += sum;
								break;
							}
						}
					}
					map.put(team, score);
				}
			}

			Iterator iterator = map.keySet().iterator();
			while (iterator.hasNext()) {
				String temp = (String) iterator.next();
			}
			// 정렬
			Iterator it = sortByValue(map).iterator();

			// 출력
			int i = 0;
			while (it.hasNext()) {
				String temp = (String) it.next();
				System.out.println("팀 = " + temp + ", 승점 = " + map.get(temp) + ", 순위 = " + ++i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 정렬
	public static List<String> sortByValue(final Map<String, Integer> map) {

		List<String> list = new ArrayList<String>();

		list.addAll(map.keySet());
		Collections.sort(list, new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);
				return ((Comparable<Object>) v2).compareTo(v1);
			}
		});
		return list;
	}
}