package lambda;
//import java.time.LocalDateTime;

import java.time.LocalDate;


public class LocalDate1 {

	public static void main(String[] args) {
		
		
		LocalDate date = LocalDate.now();
		System.out.println(date.getYear()+"��");
		System.out.println(date.getMonthValue()+"��");
		System.out.println(date.getDayOfMonth()+"��");
		System.out.println(date.toString());

	}

}
