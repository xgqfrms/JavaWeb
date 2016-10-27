package ymd01;

public class NextDate {

	private int year, month, day;

	public NextDate(int year, int month, int day) {

	}

	public NextDate() {
		year = 1;
		month = 1;
		day = 1;

	}

	public int GetYear() {
		return this.year;
	}

	public int GetMonth() {
		return this.month;
	}

	public int GetDay() {
		return this.day;
	}

	public boolean IsLeap() {
		if (this.year % 4 == 0 && this.year % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public void NextDay() {
	switch (this.month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
		if(this.day==31){
			this.month=this.month+1;
			this.day=1;
		}else{
			this.day=this.day+1;
		}
		
		break;
	case 4:
	case 6:
	case 9:
		if(this.day==30){
			this.month=this.month+1;
			this.day=1;
		}else{
			this.day=this.day+1;
		}
		break;
	case 12:
		if(this.day==31){
			this.month=1;
			this.day=1;
			this.year=this.year+1;
		}else{
			this.day=this.day+1;
		}
		break;
	case 2:
		if(this.IsLeap()){
			if(this.day==29){
				this.month=3;
				this.day=1;
			}else{
				this.day=this.day+1;
			}
			
		}else{
			if(this.day==28){
				this.month=3;
				this.day=1;
			}else{
				this.day=this.day+1;
			}
		}
		break;
	}
	}
	public static void main(String[] args) {

	}

}
