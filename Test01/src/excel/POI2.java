package excel;

import java.io.File;
import java.io.IOException;




import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class POI2 {

	public static void main(String[] args) {
		// poi读取文件
		File file = new File("D:/poi.xls");
		try {
			// 创建
			@SuppressWarnings("resource")
			HSSFWorkbook workbook = new HSSFWorkbook(
					FileUtils.openInputStream(file));
			HSSFSheet sheet = workbook.getSheetAt(0);
			// HSSFSheet sheet = workbook.getSheet("sheet0");
			int rowFirst = 0;
			
			int rowLast = sheet.getLastRowNum();
			for (int i = rowFirst; i < rowLast; i++) {
				HSSFRow row = sheet.getRow(i);
				//
				int cellLast = row.getLastCellNum();
				for (int j = 0; j < cellLast; j++) {

					HSSFCell cell = row.getCell(j);
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
