package lambda;

import java.time.LocalDateTime;
/**
 * �ҵ��ˣ��Զ����������������jdk�е������ظ���
 * ������jdk�е������ˣ��ͻᱨ��
*/

public class LocalDateTime1 {

	public static void main(String[] args) {
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime.getYear()+"��");
		System.out.println(datetime.getMonthValue()+"��");
		System.out.println(datetime.getDayOfMonth()+"��");
		
		System.out.println(datetime.getHour()+"ʱ");
		System.out.println(datetime.getMinute()+"��");
		System.out.println(datetime.getSecond()+"��");
		
		System.out.println(datetime.toString());	
	}

}
