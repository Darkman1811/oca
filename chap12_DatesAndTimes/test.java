import java.time.*;
import java.time.temporal.*;

public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates");     

		Instant i=Instant.now();
		System.out.println("Instant now: "+i);
        i=i.plus(3,ChronoUnit.DAYS);
        System.out.println("+3 days: "+i);

        i=i.plus(1,ChronoUnit.HALF_DAYS);
        System.out.println("+1 half day: "+i);

        i=i.plus(5,ChronoUnit.HOURS);
        System.out.println("+5 hours: "+i);

        i=i.plus(15,ChronoUnit.MINUTES);
        System.out.println("+15 minutes: "+i);

        i=i.plus(41,ChronoUnit.SECONDS);
        System.out.println("+41 seconds: "+i);

        i=i.plus(56,ChronoUnit.NANOS);
        System.out.println("+56 nanoseconds: "+i);

        
		
	}
}