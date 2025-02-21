package Opps;

public class AbstractClassB extends AbstractClassA{

		    // Hiding implementation details
		    @Override 
		    public void stop()
		    {
		        System.out.println("Honda::Stop");
		        System.out.println("Mechanism to stop the car using break");
		    }

			@Override
			public void Test1(String name) {
				// TODO Auto-generated method stub
				 System.out.println("Name is");
			}

			@Override
			public void Test2(int a) {
				 System.out.println(4);
			}
		    
	
		}
