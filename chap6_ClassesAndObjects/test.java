public class test{
		String song="instance";  
		
	public static void main(String [] args){
		System.out.println("bobo");
       test t;
      // System.out.println(t); does not work. t does not even point to null. it does point to anyting
       t=new test();
       System.out.println(t);
       t=null;
       System.out.println(t);
	}

}