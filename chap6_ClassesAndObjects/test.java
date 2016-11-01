public class test{
	static String song="static"; //instance and classe variables can't have the same name
//	String song="instance";  //can't access instance variable from static context
	public static void main(String [] args){
		System.out.println("bobo");
        String song="local1";   //Local variable overide instance & classe variables
        System.out.println(song);
        new test().sing(song);
	}

	private void sing(String song){
       System.out.println(song);
    //   String song="local2"; //local variables and parameters can't have the same name
       System.out.println(song);
	}



}