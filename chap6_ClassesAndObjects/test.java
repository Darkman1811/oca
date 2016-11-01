public class test{
	    boolean b;
	    byte bt;
        char c;
        short sh;
        int i;
        long l;
        float fl;
        double db;
		String s;  
		
	public static void main(String [] args){
		System.out.println("bobo");
       test t;
      // System.out.println(t); does not work. t does not even point to null. it does point to anyting
       t=new test();
       System.out.println("boolean: "+t.b);
       System.out.println("byte: "+t.bt);
       System.out.println("char: "+t.c);
       System.out.println("short: "+t.sh);
       System.out.println("int: "+t.i);
       System.out.println("long: "+t.l);
       System.out.println("float: "+t.fl);
       System.out.println("double: "+t.db);
       System.out.println("String: "+t.s);
       
	}

}