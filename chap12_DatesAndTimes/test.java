import java.time.*;
import java.time.temporal.*;

public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates: Duration");     
        LocalDateTime ldt1=LocalDateTime.of(1985,11,18,18,35,40,50);
        LocalDateTime ldt2=LocalDateTime.now();
        Duration d1=Duration.between(ldt1,ldt2);
        // System.out.println("Age:"+d1.dividedBy(365)+" years"); -- Does not work
        // System.out.println("Age:"+d1.dividedBy(30)+" months"); -- Does not work
        System.out.println("Age:"+d1.toDays()+" jours"); //Converting duration to years, months is not possible
        System.out.println("Age:"+d1.toHours()+" heurs"); 
        System.out.println("Age:"+d1.toMinutes()+" minutes");

        Instant i= Instant.now().plus(d1);
        System.out.println("You will reach the double of your age at: "+i);
		
	
	}
}