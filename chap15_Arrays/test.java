public class test{
	public static void main(String [] args){
		System.out.println("Arrays");
		
		String [][]arr1={{"1","Abdoulaye"},{"2","Yacine"},{"3","Fatou"},{"4","Modou"},{"5","Moussa"}};  
        
        for(String [] dim1:arr1){

        	// String i=dim1[0]; System.out.println("i: "+i);
        	// String str=dim1[1]; System.out.println("str: "+str);

        	 for(String  str2:dim1){
              System.out.println("str: "+str2);
        	 }
        
        }	
	}

}