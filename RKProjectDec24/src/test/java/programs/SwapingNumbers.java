package programs;

import org.testng.annotations.Test;

public class SwapingNumbers {


		 // Using temporary variable
		@Test
		void test() {
		int a=10 ,b=20 ,temp;
		
		System.out.println("Before swapping Value of a="+a+" & Value of b="+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping Value of a="+a+" & Value of b="+b);
		
		}
		 // Without Using temporary variable
		@Test
		void test1()
		{
			double m=1,n=9;
			System.out.println("Before swapping Value of m="+m+" & Value of n="+n);
			
			m=m+n; 
			n=m-n; 
			m=m-n;
			System.out.println("After swapping Value of m="+m+" & Value of n="+n);

		}
		
		
		}
