package excel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class POI_xssf2 {

	public static void main(String[] args) {
		// POI_xssf读取excel 高版本文件
		File file = new File("D:/poi_xssf.xlsx");
		try {
			// 创建
			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(
					FileUtils.openInputStream(file));
			Sheet sheet = workbook.getSheetAt(0);
			
			int rowFirst = 0;
			
			int rowLast = sheet.getLastRowNum();
			for (int i = rowFirst; i < rowLast; i++) {
				Row row = sheet.getRow(i);
				//
				int cellLast = row.getLastCellNum();
				for (int j = 0; j < cellLast; j++) {

					Cell cell = row.getCell(j);
					String value = cell.getStringCellValue();
					System.out.print(value+"\t" );
				}
                System.out.println();
//				workbook.close();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
