public class test{
	public static void main(String [] args){
		System.out.println("bobo");
		String str=new String("Hello");
		Object obj=str;

		str=(String)str; System.out.println(str);

		boolean isString=obj instanceof String; System.out.println("isString: "+isString);

	}
}