package overriding;

public class Child extends Parent{

	public static void main(String[] args) {
		Child c = new Child();
		c.test();
		
		Parent p = new Parent();
		p.test();
	
		

	}
	public void test()
	{
		int a=10 ,b=20 ,c;
		c=a+b;
		System.out.println(c);
		System.out.println("Child method");
	}
	

}
