package week4_0329;

import java.util.Calendar;

public class SwitchTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DAY_OF_MONTH);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String daystr = "";
		
		switch(day) {
		case Calendar.SUNDAY:
			daystr="일";
			break;
		}
		switch(day) {
		case Calendar.MONDAY:
			daystr="월";
			break;
		}
		switch(day) {
		case Calendar.TUESDAY:
			daystr="화";
			break;
		}
		switch(day) {
		case Calendar.WEDNESDAY:
			daystr="수";
			break;
		}
		switch(day) {
		case Calendar.THURSDAY:
			daystr="목";
			break;
		}
		switch(day) {
		case Calendar.FRIDAY:
			daystr="금";
			break;
		}
		switch(day) {
		case Calendar.SATURDAY:
			daystr="토";
			break;
		}
		
		System.out.printf("%d년 %d월 %d일 %s요일", year, month+1, date, daystr);
	}
}
