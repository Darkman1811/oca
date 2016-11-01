public class test{
	public static void main(String [] args){
		System.out.println("bobo");
//------------------------------------------------------------------------------INSTANCIATION
		String str1= "Hello";
		String str2= new String ("Hello");
//------------------------------------------------------------------------------FUNCTIONS
		int lenght= str1.length(); System.out.println("lenght of str1: "+lenght);

        boolean isSame= str1.equals(str2); System.out.println("is str1 same that str2: "+isSame);

	}
}