import java.time.*;
import java.time.zone.*;
public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates");     

		LocalDate ld=LocalDate.of(2016,10,29);
		ld=LocalDate.ofYearDay(1985,18);
		// ld=LocalDate.ofYearMonth(1985,18); -- Year an Month only does not work

		LocalTime lt=LocalTime.of(07,46,13);
		lt=LocalTime.of(07,46); //Time without second
		// lt=LocalTime.of(07); -- Hours only does not work
		lt=LocalTime.ofSecondOfDay(75000);  //Time from a number of seconds

		LocalDateTime ldt=LocalDateTime.of(2016,10,29,07,46,13);
		// ZoneDateTime.now();
		System.out.println("Date: "+ld);
		System.out.println("Time: "+lt);
		System.out.println("DateTilme: "+ldt);
	}
}