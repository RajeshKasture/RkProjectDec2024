package superkeywork;

public class Child extends Parent {
	String name="clild";
	int income= 10; 
	
	public void test()
	{   
	
		System.out.println("Method of clild class");
		System.out.println(name);
		System.out.println(income);
		
		super.test();
		System.out.println(super.name);
		System.out.println(super.income);
		
	}
	
	public static void main(String[] args) {
		
		
		    Child c =new Child();
			c.test();

			
	}

	
	
	
	
	
   

}
