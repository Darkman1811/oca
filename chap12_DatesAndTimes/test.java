import java.time.*;
import java.time.temporal.*;

public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates: Zone offset");     
        
        Instant i= Instant.now();
        System.out.println("now hiere: "+i);
        ZoneOffset zof=ZoneOffset.ofHoursMinutesSeconds(+6,30,15);
        System.out.println("Zone offset: "+zof);
		OffsetDateTime odt=i.atOffset(zof);
		System.out.println("At the Zone offset: "+odt);
		

	}
}