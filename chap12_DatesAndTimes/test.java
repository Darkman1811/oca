import java.time.*;
import java.time.zone.*;
import java.util.List;
public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates: Zone offset");     
        
        //Month from date
       LocalDate ld=LocalDate.of(1985,11,18);
       DayOfWeek dow1= DayOfWeek.from(ld);

       //5 days later
       DayOfWeek dow2= dow1.plus(5);

       //3 days befor
       DayOfWeek dow3=dow1.minus(3);



       System.out.println("Day of Week dow1: "+dow1);
       System.out.println("Day of Week dow2: "+dow2);
       System.out.println("Day of Week dow3: "+dow3);
       }
}