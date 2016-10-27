import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



/**
 * CSV����(�����͵���)
 * 
 * @author �ּ���
 * @version 1.0 Jan 27, 2014 4:17:02 PM
 */
public class CsvTest {

    /**
     * CSV����
     * 
     * @throws Exception
     */
    @Test
    public void exportCsv() {
        List<String> dataList=new ArrayList<String>();
        dataList.add("1,����,��");
        dataList.add("2,����,��");
        dataList.add("3,С��,Ů");
        boolean isSuccess=CSVUtils.exportCsv(new File("D://test1.csv"), dataList);
        System.out.println(isSuccess);
    }
    
    /**
     * CSV����
     * 
     * @throws Exception
     */
    @Test
    public void importCsv()  {
        List<String> dataList=CSVUtils.importCsv(new File("D://test.csv"));
        if(dataList!=null && !dataList.isEmpty()){
            for(String data : dataList){
                System.out.println(data);
            }
        }
    }
    
    
}