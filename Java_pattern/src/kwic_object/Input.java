package kwic_object;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author �Ĺ�Ǭ-���һ�� ������
 */
public class Input {
    public static LineStorage parse(FileReader fr)throws IOException{
        BufferedReader br=new BufferedReader(fr);//ʵ���� ��������ļ� ������
        LineStorage ls=new LineStorage();//ʵ���� 
        while(br.ready()){
            ls.addLine(br.readLine());//����addLine����(String line)���ж���
        }
        br.close();//�ر�
            return ls;
    }

}
