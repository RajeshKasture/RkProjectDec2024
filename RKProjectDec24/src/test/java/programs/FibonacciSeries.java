package programs;

import org.testng.annotations.Test;

public class FibonacciSeries {
	
	@Test
	void test() {
		
		int a=0 ,b=1 ,count=10;
     	System.out.print(a +" " +b+" ");
		
		
		for(int i=2; i<=count; i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
	

}
