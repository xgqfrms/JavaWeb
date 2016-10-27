package kwic_object;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author 夏光乾-软件一班 第六组
 */
public class Input {
    public static LineStorage parse(FileReader fr)throws IOException{
        BufferedReader br=new BufferedReader(fr);//实例化 带缓冲的文件 输入流
        LineStorage ls=new LineStorage();//实例化 
        while(br.ready()){
            ls.addLine(br.readLine());//调用addLine方法(String line)逐行读入
        }
        br.close();//关闭
            return ls;
    }

}
