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
public class CircularShifter {
 private LineStorage shifts=null;//声明
 public CircularShifter(LineStorage shifts){// 循环移位方法
     this.shifts=shifts;
 }
 public void newShiftedLS(){
     int number_of_lines=shifts.number_of_lines();//循环次数
     ArrayList<ArrayList> exlist=new ArrayList<ArrayList>(0);//泛型 数组
     ArrayList<String> inlist=new ArrayList<String>(0);
    for(int i=0;i<number_of_lines;i++){//循环
        for(int j=0;j<shifts.words_number_of_line(i);j++){//每一行的单词数作为循环次数
        if(j==0)  inlist.add(shifts.getLine(i));//判断每一行的单词数
        else inlist.add(shifts.shiftwords(i));//插入循环后的结果
        }
        exlist.add(inlist);//循环后的结果保存在字符串数组中
        inlist=new ArrayList<String>(0);
    }
    shifts=new LineStorage();
    for(int i=0;i<number_of_lines;i++){//分别输出每一行循环后的结果集
        for(int j=0;j<exlist.get(i).size();j++){//每行循环后的结果集的大小作为循环次数
            shifts.addLine((String)exlist.get(i).get(j));//将结果存放在 成员变量line中
        }
    }
    for(int i=0;i<shifts.number_of_lines();i++){//循环输出所有行
       System.out.println(shifts.getLine(i));//按行号打印
    }
 }
public String getLine(int index){
    return shifts.getLine(index);//返回行索引
}
 public int number_of_lines(){
        return shifts.number_of_lines();//返回行号
    }
public int compare(int index1,int index2){//比较 索引
    return shifts.getLine(index1).compareTo(shifts.getLine(index2));//定义排序的方法
}
}
