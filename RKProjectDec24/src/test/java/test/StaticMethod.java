package test;

public class StaticMethod {

	public static void main(String[] args) {
		StaticMethod.test1();
		test1();
		StaticMethod s = new StaticMethod(2);
	
		StaticMethod s1 = new StaticMethod("Rajesh");
	}
	public static void test1()
	{
		System.out.println("Static method");
	}
	StaticMethod(int a)
	{
		System.out.println("Constructor int");
	}
	StaticMethod(String name)
	{
		System.out.println("Constructor string");
	}
	

}
