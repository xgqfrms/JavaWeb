package kwic_object;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author �Ĺ�Ǭ-���һ�� ������
 *
 */
public class Alphabetizer { //������ĸ˳������
private CircularShifter cs;//ѭ����λ
private int[] sorted;//�洢����
public Alphabetizer(CircularShifter cs){
    this.cs=cs;//�������������
    sorted=new int[cs.number_of_lines()];//���������ȸ��� ����
    for(int i=0;i<sorted.length;i++){
        sorted[i]=i;//ѭ�����
    }
}
public void sort(){
    int temp;// ��ʱ����
    for(int i=1;i<sorted.length;i++){//���鳤��Ϊѭ������
        for(int j=i;(j>0)&&(cs.compare(sorted[j], sorted[j-1]))<0;j--){//����compare����
            temp=sorted[j];
            sorted[j]=sorted[j-1];
            sorted[j-1]=temp;//ð������
        }
    } 
}
public String getLine(int index){
    return cs.getLine(sorted[index]);//�����г���
}
public int number_of_lines(){
    return sorted.length;//�������鳤��
}
}
