public class test{
	public static void main(String [] args){
		System.out.println("bobo");
        final Personneinternal pi=new Personneinternal(); // No way to update since the members are final too
        System.out.println(pi.id);   
        System.out.println(pi.name);

        final Personneexternal pe= new Personneexternal(1,new StringBuilder("Abdoulaye"));
	    System.out.println(pe.getId());   
        System.out.println(pe.getName());

        StringBuilder sb=pe.getName();
        sb.append("Diaw");
        System.out.println(pe.getId());   
        System.out.println(pe.getName());
	}

}

class Personneinternal{
	public final int id=5;
	public final StringBuilder name=new StringBuilder("Abdoulaye");
}

class Personneexternal{
	private int id;
	private  StringBuilder name;
    public int getId(){return this.id;}
   // public void setId(int id){this.id=id ;} //-- make it externally immutable

    public StringBuilder getName(){return this.name;}
   // public void setName(StringBuilder name){this.name=name;} //-- make it externally immutable

    public Personneexternal(int id,StringBuilder name){
    	this.id=id;
    	this.name=name;
    }

}