/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kwic_object;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author 夏光乾-软件一班 第六组
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{//抛出异常
        // TODO code application logic here
        long startTime = System.nanoTime();// 声明一个 长整形变量
        FileReader fr=new FileReader("input.txt");//读入一个文件
       LineStorage ls=Input.parse(fr);//类型强制转换
       CircularShifter cs=new CircularShifter(ls);//实例化
       cs.newShiftedLS();
       Alphabetizer alpha=new Alphabetizer(cs);//实例化
       alpha.sort();//执行排序
       FileWriter fw=new FileWriter("output.txt");//输出一个文件
       Output.println(alpha, fw);//打印排序后的结果
       long estimatedTime = System.nanoTime() - startTime;//获得排序所用时间
        JOptionPane.showMessageDialog(null,"运行时间："+new Long(estimatedTime).toString()+"毫微秒");//在窗口中显示排序所用时间
    }

}
