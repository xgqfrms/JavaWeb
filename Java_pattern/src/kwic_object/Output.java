package kwic_object;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author �Ĺ�Ǭ-���һ�� ������
 */
public class Output {
public static void println(Alphabetizer alpha,FileWriter fw)throws IOException{//�׳��쳣
    BufferedWriter bw=new BufferedWriter(fw);//ʵ���� ����� �ļ������
    for(int i=0;i<alpha.number_of_lines();i++){//ѭ�����ÿһ��
        bw.write(alpha.getLine(i));//���������һ��
        bw.newLine();//���һ��
        System.out.println(alpha.getLine(i));//��ӡ���������һ��
    }
    bw.close();//�ر�
}
}
