package kwic_object;

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author �Ĺ�Ǭ-���һ�� ������
 */
public class CircularShifter {
 private LineStorage shifts=null;//����
 public CircularShifter(LineStorage shifts){// ѭ����λ����
     this.shifts=shifts;
 }
 public void newShiftedLS(){
     int number_of_lines=shifts.number_of_lines();//ѭ������
     ArrayList<ArrayList> exlist=new ArrayList<ArrayList>(0);//���� ����
     ArrayList<String> inlist=new ArrayList<String>(0);
    for(int i=0;i<number_of_lines;i++){//ѭ��
        for(int j=0;j<shifts.words_number_of_line(i);j++){//ÿһ�еĵ�������Ϊѭ������
        if(j==0)  inlist.add(shifts.getLine(i));//�ж�ÿһ�еĵ�����
        else inlist.add(shifts.shiftwords(i));//����ѭ����Ľ��
        }
        exlist.add(inlist);//ѭ����Ľ���������ַ���������
        inlist=new ArrayList<String>(0);
    }
    shifts=new LineStorage();
    for(int i=0;i<number_of_lines;i++){//�ֱ����ÿһ��ѭ����Ľ����
        for(int j=0;j<exlist.get(i).size();j++){//ÿ��ѭ����Ľ�����Ĵ�С��Ϊѭ������
            shifts.addLine((String)exlist.get(i).get(j));//���������� ��Ա����line��
        }
    }
    for(int i=0;i<shifts.number_of_lines();i++){//ѭ�����������
       System.out.println(shifts.getLine(i));//���кŴ�ӡ
    }
 }
public String getLine(int index){
    return shifts.getLine(index);//����������
}
 public int number_of_lines(){
        return shifts.number_of_lines();//�����к�
    }
public int compare(int index1,int index2){//�Ƚ� ����
    return shifts.getLine(index1).compareTo(shifts.getLine(index2));//��������ķ���
}
}
