public class test{
		String song="instance";  
		
	public static void main(String [] args){
		System.out.println("bobo");
       test t=new test();
       
	}
public test(){
	song="constructor";
	System.out.println(song);
}

{
	song="initializater1";
    System.out.println(song);
}

{
	song="initializater2";
	System.out.println(song);
}
}