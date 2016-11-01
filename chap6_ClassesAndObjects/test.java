public class test{
	public static void main(String [] args){
		System.out.println("bobo");
        new Personne().sayhello();
	}
}
// only one public class is autorized
//tha public class must have the same name as the file
// only public and specifying no access lever (package acces level) is authorized for classes
 class Personne{
	public void sayhello(){
      System.out.println("hello man welcome to java!!!");
	}


}