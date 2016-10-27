package lambda;
//import java.time.LocalDateTime;

import java.time.LocalDate;


public class LocalDate1 {

	public static void main(String[] args) {
		
		
		LocalDate date = LocalDate.now();
		System.out.println(date.getYear()+"Äê");
		System.out.println(date.getMonthValue()+"ÔÂ");
		System.out.println(date.getDayOfMonth()+"ÈÕ");
		System.out.println(date.toString());

	}

}
