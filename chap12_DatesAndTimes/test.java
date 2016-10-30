import java.time.*;
import java.time.zone.*;
public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates");     

		
		LocalDateTime ldt=LocalDateTime.of(2016,10,29,07,46,13);

		LocalDate ld=LocalDate.from(ldt);
		LocalTime lt=LocalTime.from(ldt);

		// ld= LocalDate.from(lt); -- Does not work - Unable to obtain LocalDate from TemporalAccessor: 07:46:13 of type java.time.LocalTime
	    // lt=LocalTime.from(ld);  -- Does not work - java.time.DateTimeException: Unable to obtain LocalTime from TemporalAccessor: 2016-10-29 of type java.time.LocalDate
        
        ld= LocalDate.from(ld);
        lt=LocalTime.from(lt);

		System.out.println("DateTilme: "+ldt);
		System.out.println("Date: "+ld);
		System.out.println("Time: "+lt);
	}
}