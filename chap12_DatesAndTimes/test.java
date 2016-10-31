import java.time.*;
import java.time.zone.*;
import java.util.List;
public class test{

	public static void main(String [] args){
		System.out.println("Testing Dates: Zone offset");     
        
        //Month from date
       LocalDate ld=LocalDate.of(1985,11,18);
       Month m1=Month.from(ld);
       
       //Month from int
       Month m2=Month.of(3);
       

       // 5 Months later
       Month m3=m1.plus(5);

       //Int value of the month
       int mois= m3.getValue();



       System.out.println("Mois 1 : "+m1);
       System.out.println("Mois 2 : "+m2);
       System.out.println("Mois 3 : "+m3);
       System.out.println("Int Value of m3 : "+mois);

       }
}