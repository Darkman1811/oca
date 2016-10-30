import java.time.*;
import java.time.temporal.*;

public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates");     
        LocalDateTime ldt=LocalDateTime.of(2016,11,18,18,35,40,50);
		Instant i=Instant.ofEpochSecond(ldt.toEpochSecond(ZoneOffset.UTC));
		System.out.println("origin: "+i);

		Duration du=Duration.ofMinutes(15);
		System.out.println("Dureé de 15mn: "+du);

		i=i.plus(du);
		System.out.println("Instant + duréé 25 mn "+i);

        		
	}
}