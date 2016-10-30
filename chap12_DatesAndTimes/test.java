import java.time.*;
import java.time.zone.*;
public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates");     

		
		LocalDateTime ldt=LocalDateTime.now();
		LocalDate ld=ldt.toLocalDate();
		
		LocalTime lt=ldt.toLocalTime();
        
		System.out.println("LocalDateTime: "+ldt);
		System.out.println("LocalDate: "+ld);
		System.out.println("LocalTime: "+lt);

		
	}
}