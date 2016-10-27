package kwic_object;

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 夏光乾-软件一班 第六组
 */
public class LineStorage { 
    private ArrayList<String> lines=null;//声明 泛型
    public LineStorage(){
        lines=new ArrayList<String>(0);//实例化 string泛型
    }
    public String getLine(int index){
        return lines.get(index);//返回行 索引
    }
    public void addLine(String line){
        lines.add(line);//添加一行
    }
    public void addLine(int index,String line){
        lines.add(index,line);//添加索引，一行
    }
    public int number_of_lines(){
        return lines.size();//返回行数
    }
    public  int words_number_of_line(int index){
        return lines.get(index).split(" ").length;
        //按索引确定那一行，将该行字符串按空格分割成子字符串，并且分别获得子字符串长度
    }
   
    public  String  shiftwords(int line_index){
        String line=this.getLine(line_index);//获得行索引
        int temp_index=line.indexOf(' ');//找到空格索引
        String temp1="";
        String temp2="";
        if(temp_index!=-1){//如果存在空格执行if语句
            temp1=line.substring(0,temp_index);//获得每一行的第一个单词
            temp2=line.substring(temp_index+1);//获得每一行的除去第一个单词的子字符串
            lines.set(line_index,temp2+" "+temp1);//交换位置
            return temp2+" "+temp1;//返回 交换后的结果
        }
        else return null;
    }
            
}
