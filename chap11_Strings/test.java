public class test{
	public static void main(String [] args){
		System.out.println("bobo");
		StringBuilder sb1=new StringBuilder("here is the content"); System.out.println(sb1);
		StringBuilder sb2=new StringBuilder(200); //With size 

		int len=sb2.length(); System.out.println(len);
		int cap=sb2.capacity(); System.out.println(cap);

		//StringBuilder from String
		String str= new String("Hello from String");
		StringBuilder sb3= new StringBuilder(str); System.out.println(sb3);

		String str2=sb3.toString(); System.out.println(str2);

		sb3.append(". Java is great !!!"); System.out.println(sb3);
	}
}