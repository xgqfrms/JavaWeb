package lambda;


import java.time.LocalTime;

public class LocalTime1 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time.getHour()+"ʱ");
		System.out.println(time.getMinute()+"��");
		System.out.println(time.getSecond()+"��");
		System.out.println(time.toString());

	}

}
