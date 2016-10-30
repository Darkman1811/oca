import java.time.*;
import java.time.zone.*;
import java.util.List;
public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates: Zone offset");     
        
        Instant i= Instant.now();
        System.out.println("now hiere: "+i);


        ZoneId zoneDakar=ZoneId.of("Africa/Dakar");
		ZonedDateTime atDakar=i.atZone(zoneDakar);
		System.out.println("At the Zone offset: "+atDakar);

       ZoneRules rules=zoneDakar.getRules();
       boolean isFixedOffset=rules.isFixedOffset();
       System.out.println("Is fixed offset: "+isFixedOffset); 
       ZoneOffset offset=rules.getOffset(i);
       System.out.println("Actual offset: "+offset); // Z = UTC +0		
       List<ZoneOffsetTransition> zot=rules.getTransitions();
       System.out.println(zot);
	}
}