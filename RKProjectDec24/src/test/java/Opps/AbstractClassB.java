package Opps;

public class AbstractClassB extends AbstractClassA{

		    // Hiding implementation details
		    @Override public void stop()
		    {
		        System.out.println("Honda::Stop");
		        System.out.println(
		            "Mechanism to stop the car using break");
		    }
	
		}
