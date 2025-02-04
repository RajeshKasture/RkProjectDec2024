package arrays;

import org.testng.annotations.Test;

public class Arrays {
	//1D arrays
	@Test
	public void example()
	{
		int [] marks = new int [3];
		
		marks[0]=90;
		marks[1]=92;
		marks [2]=83;
		
		int sum = marks[0]+marks[1];
		System.out.println(sum);
		System.out.println("==============================");
		
		for (int i=0; i<3; i++)
		{
			System.out.println(marks[i]);
		}
		 
		
	}
	@Test
	void test () {
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
		

		for (int i=1; i<intArray.length; i++)
		{
			System.out.println("Index "+i);
		}
		
		
	}
	@Test
	void test1()
	{
		 int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

	        // printing 2D array
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++)
	                System.out.print(arr[i][j] + " ");

	            System.out.println();
	        }
		
	
	}	
	@Test
	void test2() {
		

        int arr[] = { 3, 1, 2, 5, 4 };

        // passing array to method m1
    //    sum(arr);
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        

        System.out.println("sum of array values : " + sum);
		
	}
	
}
