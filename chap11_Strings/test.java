public class test{
	public static void main(String [] args){
		System.out.println("bobo");
		StringBuilder sb1=new StringBuilder("here is the content"); System.out.println(sb1);
		StringBuilder sb2=new StringBuilder(200); //With size 

		int len=sb2.length(); System.out.println(len);
		int cap=sb2.capacity(); System.out.println(cap);
	}
}