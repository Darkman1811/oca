public class test{
	public static void main(String [] args){
		System.out.println("bobo");
		Personne pers= new Personne();
		pers.id=1;
		pers.name="Abdoulaye";
		System.out.println(pers);

	}

}

class Personne{
	public int id;
	public String name;

	public String toString(){
		return("id:"+id+" -name:"+name);
	}
}