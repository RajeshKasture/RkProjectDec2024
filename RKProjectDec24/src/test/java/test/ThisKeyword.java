package test;

import org.testng.annotations.Test;

public class ThisKeyword {

//	public static void main(String[] args) {
		
		int a=2;
		@Test
		public void test()
		{
			int a =5;
			System.out.println(this.a);
			System.out.println(a);
		}
		

	}


