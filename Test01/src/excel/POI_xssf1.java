package excel;

import java.io.File;
import java.io.FileOutputStream;



import org.apache.commons.io.FileUtils;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POI_xssf1 {

	public static void main(String[] args) {
		// POI_xssf生成excel高版本文件
		String[] titel = { "id", "name", "gender" };

		//
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		Sheet sheet= workbook.createSheet();
		Row row =sheet.createRow(0);
		Cell cell= null;
		//第一行
		for(int i=0;i<titel.length;i++){
			cell = row.createCell(i);
			cell.setCellValue(titel[i]);
		}
		//追加数据
		
		for(int j=1;j<=10;j++){
			Row row2=null;
			Cell cell2=null;
			row2=sheet.createRow(j);
			
			cell2=row2.createCell(0);
			cell2.setCellValue("学号"+j);
			
			cell2=row2.createCell(1);
			cell2.setCellValue("姓名"+j);
			
			cell2=row2.createCell(2);
			cell2.setCellValue("female"+j);			
		}
		//创建excel文件
		File file =new File("D:/poi_xssf.xlsx");
		try {
			file.createNewFile();
			FileOutputStream stream = FileUtils.openOutputStream(file);
			workbook.write(stream);
			workbook.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}