public class test{
	public static void main(String [] args){
		System.out.println("Arrays");
		int i=0;

		int [] arr1= {1,2,3,4,5,6,7,8}; 
		int len1=arr1.length;System.out.println(len1);
		while(i<len1){
			System.out.println(arr1[i]);
			i++;
		}
        for(int j=0;j<len1-1;j++){
        	System.out.println(arr1[j]);
        }
		

		String []arr2={"Abdoulaye","Yacine","Fatou"};  
        for(String str:arr2){
        	System.out.println(str);
        }
		
	}
}