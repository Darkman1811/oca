import java.time.*;
import java.time.zone.*;
public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates");     

		
		LocalDateTime ldt=LocalDateTime.now();

		LocalDate ld=LocalDate.now();
		ldt=ld.atStartOfDay();
		System.out.println("LocalDateTime: "+ldt);
        
        ldt=ld.atTime(15,30);
        System.out.println("LocalDateTime: "+ldt);

        ld=Year.of(2017).atMonth(5).atDay(22);        
        System.out.println("LocalDate: "+ld);
        
        LocalTime lt=LocalTime.now();
        ldt=lt.atDate(ld);
        System.out.println("LocalDateTime: "+ldt);

		
	}
}