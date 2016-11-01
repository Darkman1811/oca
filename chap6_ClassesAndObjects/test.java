public class test{
	    final int f2=11;
	    static final int f4=15;
		
	public static void main(String [] args){
		new test().varargm1(12);
		new test().varargm1(12,2,4,6); //the third ovverid would make this call ambigious
		new test().varargm1(12,"hello",4,6);
	}

  public void varargm1(int i1,int...i){
  	System.out.println("mandatory: "+i1);
  	int len=i.length;
  	System.out.println("optional: ");
  	for(int j=0;j<len;j++){
  	System.out.println(i[j]);
    }
  }
  
  public void varargm1(int i1,String str,int...i){
  	System.out.println("mandatory v2 : ");
  	System.out.println(i1);
  	System.out.println(str);
  	int len=i.length;
  	System.out.println("optionalv2: ");
  	for(int j=0;j<len;j++){
  	System.out.println(i[j]);
    }
  }
/*
   public void varargm1(int i1,int i2,int...i){
  	System.out.println("mandatory v3 : ");
  	System.out.println(i1);
  	System.out.println(i2);
  	int len=i.length;
  	System.out.println("optionalv3: ");
  	for(int j=0;j<len;j++){
  	System.out.println(i[j]);
    }
  }
  */

}



