import java.time.*;
import java.time.temporal.*;

public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates: Zone offset");     
        
        ZoneOffset zof1=ZoneOffset.ofHours(+6);
        ZoneOffset zof2=ZoneOffset.ofHoursMinutes(+5,30);
        ZoneOffset zof3=ZoneOffset.ofHoursMinutesSeconds(+1,30,15);
		
		System.out.println("Zone 1: "+zof1);
		System.out.println("Zone 2: "+zof2);
		System.out.println("Zone 3: "+zof3);
	
	}
}