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
public class LineStorage { 
    private ArrayList<String> lines=null;//���� ����
    public LineStorage(){
        lines=new ArrayList<String>(0);//ʵ���� string����
    }
    public String getLine(int index){
        return lines.get(index);//������ ����
    }
    public void addLine(String line){
        lines.add(line);//���һ��
    }
    public void addLine(int index,String line){
        lines.add(index,line);//���������һ��
    }
    public int number_of_lines(){
        return lines.size();//��������
    }
    public  int words_number_of_line(int index){
        return lines.get(index).split(" ").length;
        //������ȷ����һ�У��������ַ������ո�ָ�����ַ��������ҷֱ������ַ�������
    }
   
    public  String  shiftwords(int line_index){
        String line=this.getLine(line_index);//���������
        int temp_index=line.indexOf(' ');//�ҵ��ո�����
        String temp1="";
        String temp2="";
        if(temp_index!=-1){//������ڿո�ִ��if���
            temp1=line.substring(0,temp_index);//���ÿһ�еĵ�һ������
            temp2=line.substring(temp_index+1);//���ÿһ�еĳ�ȥ��һ�����ʵ����ַ���
            lines.set(line_index,temp2+" "+temp1);//����λ��
            return temp2+" "+temp1;//���� ������Ľ��
        }
        else return null;
    }
            
}
