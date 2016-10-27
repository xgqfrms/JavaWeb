package ymd01;


public class CountDate {
	public static void leapYear(int year) {
		//ÅĞ¶ÏÊÇ·ñÎªÈòÄê
		if (((year % 100 == 0) && (year % 400 == 0))
				|| ((year % 100 != 0) && (year % 4 == 0)))
			System.out.print(year + " is leap year");
		else
			System.out.print(year + " is not leap year");
	}

	public static void main(String[] args) {
		leapYear(1000);
	}
}