import java.time.*;
import java.time.zone.*;
public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates");     

		
		LocalDateTime ldt=LocalDateTime.now();
		LocalDate ld=LocalDate.now();
        LocalTime lt=LocalTime.now();

        System.out.println("LocalDate:");
		System.out.println("Today: "+ld);
        ld=ld.minusYears(3);
        System.out.println("-3 years: "+ld);
        ld=ld.minusMonths(4);
        System.out.println("-4 months: "+ld);
        ld=ld.minusWeeks(2);
        System.out.println("- two weeks: "+ld);
        ld=ld.minusDays(9);
        System.out.println("minus 9 days: "+ld);

        System.out.println("\n \n LocalTime:");        
        System.out.println("now: "+lt);
        lt=lt.minusHours(4);
        System.out.println("-4 Hours: "+lt);
        lt=lt.minusMinutes(25);
        System.out.println("-25 minutes: "+lt);
        lt=lt.minusSeconds(30);
        System.out.println("-30 secondes: "+lt);
        lt=lt.minusNanos(17);
        System.out.println("-17 nanosecodes: "+lt);

        System.out.println("\n \n LocalDateTime:");
        System.out.println("Today now: "+ldt);
        ldt=ldt.minusYears(3);
        System.out.println("-3 years: "+ldt);
        ldt=ldt.minusMonths(4);
        System.out.println("-4 months: "+ldt);
        ldt=ldt.minusWeeks(2);
        System.out.println("- two weeks: "+ldt);
        ldt=ldt.minusDays(9);
        System.out.println("minus 9 days: "+ldt);
        ldt=ldt.minusHours(4);
        System.out.println("-4 Hours: "+ldt);
        ldt=ldt.minusMinutes(25);
        System.out.println("-25 minutes: "+ldt);
        ldt=ldt.minusSeconds(30);
        System.out.println("-30 secondes: "+ldt);
        ldt=ldt.minusNanos(17);
        System.out.println("-17 nanosecodes: "+ldt);
        
		
	}
}