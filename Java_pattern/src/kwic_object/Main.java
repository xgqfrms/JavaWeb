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
 * @author �Ĺ�Ǭ-���һ�� ������
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{//�׳��쳣
        // TODO code application logic here
        long startTime = System.nanoTime();// ����һ�� �����α���
        FileReader fr=new FileReader("input.txt");//����һ���ļ�
       LineStorage ls=Input.parse(fr);//����ǿ��ת��
       CircularShifter cs=new CircularShifter(ls);//ʵ����
       cs.newShiftedLS();
       Alphabetizer alpha=new Alphabetizer(cs);//ʵ����
       alpha.sort();//ִ������
       FileWriter fw=new FileWriter("output.txt");//���һ���ļ�
       Output.println(alpha, fw);//��ӡ�����Ľ��
       long estimatedTime = System.nanoTime() - startTime;//�����������ʱ��
        JOptionPane.showMessageDialog(null,"����ʱ�䣺"+new Long(estimatedTime).toString()+"��΢��");//�ڴ�������ʾ��������ʱ��
    }

}
