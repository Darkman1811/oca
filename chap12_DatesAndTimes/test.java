import java.time.*;
import java.time.zone.*;
public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates");     

		
		LocalDateTime ldt=LocalDateTime.now();
		LocalDate ld=LocalDate.now();
		ld=ld.withYear(2014);
		ld=ld.withMonth(3);
		ld=ld.withDayOfMonth(11);

		LocalTime lt=LocalTime.now();
        lt=lt.withHour(18);
        lt=lt.withMinute(47);
        lt=lt.withSecond(56);
        lt=lt.withNano(37);



		System.out.println("DateTilme: "+ldt);
		System.out.println("Date: "+ld);
		System.out.println("Time: "+lt);
	}
}