public class test{
	public static void main(String [] args){
		System.out.println("bobo");
		String str=new String("Hello");
		Object obj=str;

		str=(String)str; System.out.println(str);

        System.out.println("obj: "+obj.getClass().getName());
		System.out.println("str: "+str.getClass().getName());


	}

}