package pkg1;
import java.time.*;
public class DayOfYear {
	
	public static int dayOfYear(String date) {
		
		int day = LocalDate.parse(date).getDayOfYear();
		
		
		
        
        return day;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dayOfYear("2019-04-09"));
	}

}
