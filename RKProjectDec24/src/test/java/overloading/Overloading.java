package overloading;

public class Overloading {

	public static void main(String[] args) {
	
 
		Overloading o = new Overloading();
		o.test();
		o.test("Rajesh");
		o.test(10);
	    o.test(1,2.0);
	}
	//same method name with different parameters
	public void test()
	{
		System.out.println("Empty Method");
		
	}
	public void test(String name)
	{
		System.out.println("Method with srting parameter");
	}
	public void test(int a)
	{
		System.out.println("Method with int parameter");
	}
	public void test(int b , double c)
	{
		System.out.println("Method with int & double parameter");	
	}
	

}
