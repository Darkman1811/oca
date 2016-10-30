import java.time.*;
import java.util.Set;
public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates: Zone offset");     
        
        Set<String> zoneIds= ZoneId.getAvailableZoneIds();
        for(String zoneid:zoneIds){
        	System.out.println(zoneid);
        }
		

	}
}