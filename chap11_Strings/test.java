public class test{
	public static void main(String [] args){
		System.out.println("bobo");
//------------------------------------------------------------------------------INSTANCIATION
		String str1= "Hello";
		String str2= new String ("Hello");
//------------------------------------------------------------------------------FUNCTIONS
		int lenght= str1.length(); System.out.println("lenght of str1: "+lenght);

        boolean isSame= str1.equals(str2); System.out.println("is str1 same that str2: "+isSame);

        //Based on the unicode Values of the String
        int dif= str1.compareTo(str2); System.out.println("is str1 different from str2: "+dif);

        // No case sentive
        boolean isSame2= str1.equalsIgnoreCase(str2); System.out.println("is str1 same that str2 ignoring case: "+isSame2);
        
        boolean hasContent= str1.isEmpty(); System.out.println("is str1 empty: "+hasContent);




	}
}