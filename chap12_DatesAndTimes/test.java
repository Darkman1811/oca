import java.time.*;
import java.time.zone.*;
public class test{

	public static void main(String [] args){
		System.out.println("bobo");        
		LocalDate ld=LocalDate.now();
		LocalTime lt=LocalTime.now();
		LocalDateTime ldt=LocalDateTime.now();
		// ZoneDateTime.now();
		System.out.println("Date: "+ld);
		System.out.println("Time: "+lt);
		System.out.println("DateTilme: "+ldt);
	}
}