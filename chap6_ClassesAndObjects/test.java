
import java.time.*; //does not concerne the subpackages of java.time
//import java.time.temporal.*; //importing chronofiel from java.time.temporal.ChronoField
public class test{
	    
		
	public static void main(String [] args){
		System.out.println("bobo");
       

        LocalDate ld= LocalDate.now(); System.out.println(ld);
        System.out.println(ld.get(ChronoField.YEAR)); //not in java.time

       
	}

}