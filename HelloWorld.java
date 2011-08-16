public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello, World!");
		System.out.println(add(3,4));
		sayGoodBye();
	}
	public static void sayGoodBye(){
		System.out.println("Good Bye");
	}
	public static int add(int a, int b){
		return a+b;
	}
	public static void imWorried(){
		System.out.println("I'm worried this statement will be deleted".);
	}
}

