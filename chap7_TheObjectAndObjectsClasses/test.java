public class test{
	public static void main(String [] args){
		System.out.println("bobo");
	    Personne pers= new Personne();
	    pers.id=1;
	    pers.name="Abdoulaye";
	    System.out.println(pers.hashCode());
	   
	    Personne pers2=new Personne();
        pers2.id=1;
        pers2.name="Yacine";
	   System.out.println(pers.equals(pers2));
	}

}

class Personne{
	int id;
	String name;
public boolean equals(Object obj){
	 if(obj==this){return true;} 
	if(!(obj instanceof Personne)){return false;}
    Personne other=(Personne)obj;
    if(this.id==other.id){return true;}
return false;
}

public int hashCode(){
  
int code=18;
int hashcode=this.id*code;
return hashcode;
}

}