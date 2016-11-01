public class test{
	    final int f2=11;
	    static final int f4=15;
		
	public static void main(String [] args){
		final int f1=10;
		//f1++; //-- not possible as f1 is declared final
		//new test().f2=12;//-- not possible as f2 is declared final
        int i=13;
        new test().workon(i);
        // f4=16; //-- not possible as f4 is declared final

        final Personne p= new Personne(); 
        System.out.println(p.getI());
        p.setI(21);
        System.out.println(p.getI()); //p is mutable but not his member i;
      //  p=new Personne(); //- does not wor as p is declared final
	}

  public void workon(final int f3){
  	//f3=14; //-- not possible as f3 is declared final
  }


}

class Personne{
	int i;
    public Personne(){
    	i=20;
    }
	public int getI(){
		return i;
	}

	public void setI(int i){
		this.i=i;
	}
}

