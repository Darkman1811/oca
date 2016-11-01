public class test{
	public static void main(String [] args){
		System.out.println("Arrays");
		
		String []arr1={"Abdoulaye","Yacine","Fatou"};  

		String []arr2={"Modou","Moussa"};  

		String [] arr3= new String[6];
         
        System.arraycopy(arr1,0,arr3,0,3);
        System.arraycopy(arr2,0,arr3,3,2);

        for(String str:arr3){
        	System.out.println(str);
        }
		
	}
}