package excel;

import java.io.File;




import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class E2 {

	public static void main(String[] args) {
		File file = new File("D:/jxl.xls");
		// 读excel文件
		try {
			Workbook workbook = Workbook.getWorkbook(file);
			//获取sheet下标， i=0
			Sheet sheet = workbook.getSheet(0);
			//获取数据
			for(int i=0;i<sheet.getRows();i++){
				for(int j=0;j<sheet.getColumns();j++){
					Cell cell= sheet.getCell(j,i);
					System.out.print(cell.getContents()+"\t");	
				}
				System.out.println();
			}
			workbook.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
