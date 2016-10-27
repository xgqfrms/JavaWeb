package excel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class POI1 {

	public static void main(String[] args) {
		// POI生成excel文件
		String[] titel = { "id", "name", "gender" };

		//
		HSSFWorkbook workbook = new HSSFWorkbook();
		
		HSSFSheet sheet= workbook.createSheet();
		HSSFRow row =sheet.createRow(0);
		HSSFCell cell= null;
		//第一行
		for(int i=0;i<titel.length;i++){
			cell = row.createCell(i);
			cell.setCellValue(titel[i]);
		}
		//追加数据
		
		for(int j=1;j<=10;j++){
			HSSFRow row2=null;
			HSSFCell cell2=null;
			row2=sheet.createRow(j);
			
			cell2=row2.createCell(0);
			cell2.setCellValue("学号"+j);
			
			cell2=row2.createCell(1);
			cell2.setCellValue("姓名"+j);
			
			cell2=row2.createCell(2);
			cell2.setCellValue("female"+j);			
		}
		//创建excel文件
		File file =new File("D:/poi.xls");
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














