package kwic_object;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 夏光乾-软件一班 第六组
 *
 */
public class Alphabetizer { //按照字母顺序排序
private CircularShifter cs;//循环移位
private int[] sorted;//存储数组
public Alphabetizer(CircularShifter cs){
    this.cs=cs;//将参数赋予变量
    sorted=new int[cs.number_of_lines()];//将行数长度赋予 数组
    for(int i=0;i<sorted.length;i++){
        sorted[i]=i;//循环输出
    }
}
public void sort(){
    int temp;// 临时变量
    for(int i=1;i<sorted.length;i++){//数组长度为循环次数
        for(int j=i;(j>0)&&(cs.compare(sorted[j], sorted[j-1]))<0;j--){//调用compare方法
            temp=sorted[j];
            sorted[j]=sorted[j-1];
            sorted[j-1]=temp;//冒泡排序
        }
    } 
}
public String getLine(int index){
    return cs.getLine(sorted[index]);//返回行长度
}
public int number_of_lines(){
    return sorted.length;//返回数组长度
}
}
