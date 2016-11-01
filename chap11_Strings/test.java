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
        
        String str3= str1.toUpperCase(); System.out.println("st1 to Uppercase: "+str3);
        
        String str4= str1.toLowerCase(); System.out.println("st1 to Lowercase: "+str4);

        int ind= str1.indexOf('e'); System.out.println("index of e: "+ind);

        int ind2= str1.lastIndexOf('l'); System.out.println("last index of l: "+ind2);

        String str5= "Bonjour mon bébé adoré.".substring(7); System.out.println(str5);
        String str6= "Bonjour mon bébé adoré.".substring(8,16); System.out.println(str6);

        String str7= "    Bonjour mon bébé adoré.   ".trim(); System.out.println(str7);

        String str8= str1.replace('e','a'); System.out.println(str8);

        boolean sth= str1.startsWith("h"); System.out.println(sth);
        boolean stH= str1.startsWith("H"); System.out.println(stH);

        boolean endh= str1.endsWith("h"); System.out.println(endh);
        boolean endH= str1.endsWith("H"); System.out.println(endH);

        String lst="first,second,third,fourth,fifth,sixth,seventh";
        System.out.println(lst);
        String [] parts= lst.split(",");
        System.out.println(parts);

        String str9=String.join(".","rep1","rep2","rep3","rep4"); System.out.println(str9);

	}
}