import java.time.*;
import java.time.temporal.*;
import static java.time.temporal.TemporalQueries.zone;

public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates: Zone offset");     
        
        Instant i= Instant.now();
        System.out.println("now hiere: "+i);


        ZoneId zoneDakar=ZoneId.of("Africa/Dakar");
		ZonedDateTime atDakar=i.atZone(zoneDakar);
		System.out.println("At the Zone offset: "+atDakar);


        ZoneId zoneTokyo=ZoneId.of("Asia/Tokyo");
		ZonedDateTime atTokyo=i.atZone(zoneTokyo);
		System.out.println("At the Zone offset: "+atTokyo);

        ZoneId zoneMonaco=ZoneId.of("Europe/Monaco");
		ZonedDateTime atMonaco=i.atZone(zoneMonaco);
		System.out.println("At the Zone offset: "+atMonaco);
		

	}
}