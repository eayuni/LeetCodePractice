package pkg1;

import java.time.*;



//1185. Day of the Week

public class DayOfWeek {
		public static String dayOfTheWeek(int day, int month, int year) {
			
			
		
			
			
			String[] weeks = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
			int x=Year.of(year).atMonth(Month.of(month)).atDay(day).getDayOfWeek().getValue();
			
			return weeks[x];
			
			
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dayOfTheWeek(31,8,2019));
		
		
	}

}
