import java.time.*;
import java.time.zone.*;
public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates");     

		
		LocalDateTime ldt=LocalDateTime.now();
		LocalDate ld=LocalDate.now();
		int y=ld.getYear();
		Month m=ld.getMonth();
		int d=ld.getDayOfMonth();

		LocalTime lt=LocalTime.now();
        int h=lt.getHour();
        int min=lt.getMinute();
        int s=lt.getSecond();
        int n=lt.getNano();


		System.out.println("Year: "+y);
		System.out.println("Month: "+m);
		System.out.println("Day: "+d);

		System.out.println("Hours: "+h);
		System.out.println("Month: "+min);
		System.out.println("Minutes: "+s);
		System.out.println("NanoSeconds: "+n);
	}
}