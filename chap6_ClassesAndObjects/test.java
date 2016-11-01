public class test{
		String song="instance";  
	public static void main(String [] args){
		System.out.println("bobo");
        System.out.println(new test().song);
        System.out.println(new test("custom").song);
       
	}

	public test(){       //commenting this methode out will work but song's value will be instance
		song="default";
	}
    
    public test(String song){       
		this.song=song;
		this.song=song;
	}
}