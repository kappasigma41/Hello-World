public class LoopTest{
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			printName("Bob"+i);
		}
	}
	public static void printName(String name){
		System.out.println("My name is "+name);
	}
}

