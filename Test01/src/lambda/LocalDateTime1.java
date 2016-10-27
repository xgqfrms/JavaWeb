package lambda;

import java.time.LocalDateTime;
/**
 * 找到了，自定义的类名不可以与jdk中的类名重复。
 * 类名与jdk中的重名了，就会报错！
*/

public class LocalDateTime1 {

	public static void main(String[] args) {
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime.getYear()+"年");
		System.out.println(datetime.getMonthValue()+"月");
		System.out.println(datetime.getDayOfMonth()+"日");
		
		System.out.println(datetime.getHour()+"时");
		System.out.println(datetime.getMinute()+"分");
		System.out.println(datetime.getSecond()+"秒");
		
		System.out.println(datetime.toString());	
	}

}
