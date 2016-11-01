public class test{
	public static void main(String [] args){
		System.out.println("Arrays");
		
		String []arr1={"Abdoulaye","Yacine","Fatou","Modou","Moussa"};  
        
        System.out.println("Befor workon");
        for(String str:arr1){
        	System.out.println(str);
        }

		String [] arr2= new test().workon(arr1);

        System.out.println("\n After workon");
        for(String str:arr2){
        	System.out.println(str);
        }
		
	}

	private String[] workon(String [] arr){
		int len=arr.length; 
       String [] tmparr=new String[len];
       System.arraycopy(arr,0,tmparr,0,len);

       int j=len; // compteur de arr 
       
       for(int i=0;i<len;i++){//boucle inverse pour tmparr
       	j--; //incrementer le compteur de i
       	arr[i]=tmparr[j];
        }

       
     return arr;
	}
}