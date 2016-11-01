public class test{
	    
		
	public static void main(String [] args){
		System.out.println("bobo");
		test t= new test();
		int i=5; System.out.println("before: "+i);
        t.byvalue(i);
        System.out.println("after: "+i);

        StringBuilder sb= new StringBuilder("Hello"); System.out.println("before: "+sb);
        t.byreference(sb);
        System.out.println("after: "+sb);

       
	}

   private void byvalue(int i){
   	i++;
   	System.out.println("during: "+i);

   }

   private void byreference(StringBuilder sb){
   	sb.append(" Abdoulaye");
   	System.out.println("during: "+sb);
   }
}

