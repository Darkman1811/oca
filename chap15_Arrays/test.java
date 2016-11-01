public class test{
	public static void main(String [] args){
		System.out.println("Arrays");
		
		String []arr1={"Abdoulaye","Yacine","Fatou","Modou","Moussa"};  
        
        System.out.println("arr1");
        for(String str:arr1){
        	System.out.println(str);
        }
        String [] arr2=arr1.clone();
		
        System.out.println("\n arr2");
        for(String str:arr2){
        	System.out.println(str);
        }
		
	}

}