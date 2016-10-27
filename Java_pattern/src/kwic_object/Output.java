package kwic_object;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 夏光乾-软件一班 第六组
 */
public class Output {
public static void println(Alphabetizer alpha,FileWriter fw)throws IOException{//抛出异常
    BufferedWriter bw=new BufferedWriter(fw);//实例化 缓冲的 文件输出流
    for(int i=0;i<alpha.number_of_lines();i++){//循环输出每一行
        bw.write(alpha.getLine(i));//输出排序后的一行
        bw.newLine();//输出一行
        System.out.println(alpha.getLine(i));//打印输出排序后的一行
    }
    bw.close();//关闭
}
}
