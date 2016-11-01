public class test{
	public static void main(String [] args){
		System.out.println("bobo");
	    Personne pers= new Personne();
	    pers.id=1;
	    pers.name="Abdoulaye";

	    Personne pers2=pers.clone();
	    System.out.println(pers2.id);
	    System.out.println(pers2.name);
	}

}

class Personne{
	int id;
	String name;
public Personne clone(){
	Personne other=new Personne();
	other.id=this.id;
	other.name=this.name;
	return other;
}
}