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
        ld=ld.plusYears(3);
        System.out.println("+3 years: "+ld);
        ld=ld.plusMonths(4);
        System.out.println("+4 months: "+ld);
        ld=ld.plusWeeks(2);
        System.out.println("+ two weeks: "+ld);
        ld=ld.plusDays(9);
        System.out.println("plus 9 days: "+ld);

        System.out.println("\n \n LocalTime:");        
        System.out.println("now: "+lt);
        lt=lt.plusHours(4);
        System.out.println("+4 Hours: "+lt);
        lt=lt.plusMinutes(25);
        System.out.println("+25 minutes: "+lt);
        lt=lt.plusSeconds(30);
        System.out.println("+30 secondes: "+lt);
        lt=lt.plusNanos(17);
        System.out.println("+17 nanosecodes: "+lt);

        System.out.println("\n \n LocalDateTime:");
        System.out.println("Today now: "+ldt);
        ldt=ldt.plusYears(3);
        System.out.println("+3 years: "+ldt);
        ldt=ldt.plusMonths(4);
        System.out.println("+4 months: "+ldt);
        ldt=ldt.plusWeeks(2);
        System.out.println("+ two weeks: "+ldt);
        ldt=ldt.plusDays(9);
        System.out.println("plus 9 days: "+ldt);
        ldt=ldt.plusHours(4);
        System.out.println("+4 Hours: "+ldt);
        ldt=ldt.plusMinutes(25);
        System.out.println("+25 minutes: "+ldt);
        ldt=ldt.plusSeconds(30);
        System.out.println("+30 secondes: "+ldt);
        ldt=ldt.plusNanos(17);
        System.out.println("+17 nanosecodes: "+ldt);
        
		
	}
}