package excel;

import java.io.File;

import jxl.*;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class E1 {

	public static void main(String[] args) {
//		String[] title = {"excel", "id", "name", "gender" };
		String[] title = { "id", "name", "gender" };
		// 创建excel文件
		File file = new File("D:/jxl.xls");
		try {
			file.createNewFile();
			// 创建工作簿
			WritableWorkbook workbook = Workbook.createWorkbook(file);
			WritableSheet sheet = workbook.createSheet("sheet1", 0);
			Label lable = null;
			// 第一行，设置列名
			for (int i = 0; i < title.length; i++) {
				lable = new Label(i, 0, title[i]);//《列号下标，行号下标，cell内容》
				sheet.addCell(lable);

			}
			// 从第二行，追加数据
			for (int i = 1; i <= 10; i++) {

				lable = new Label(0, i+1, "id" +i);//《参数1，参数2，参数3》===《列号下标，行号下标，cell内容》
				sheet.addCell(lable);
				lable = new Label(1, i+1, "user" + i);
				sheet.addCell(lable);
				lable = new Label(2, i+1, "male");
				sheet.addCell(lable);
//				lable = new Label(1, i+1, "id" +i);//《参数1，参数2，参数3》===《列号下标，行号下标，cell内容》
//				sheet.addCell(lable);
//				lable = new Label(2, i+1, "user" + i);
//				sheet.addCell(lable);
//				lable = new Label(3, i+1, "male");
//				sheet.addCell(lable);
			}
			workbook.write();
			workbook.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
