package try_Catch;

public class TryCatch {

	public static void main(String[] args) {

		
		int a=4;
		int b=2;
		
		try
		{
		int c= a/b;
		System.out.println("The answer is :-"+c);
		}
		catch(Exception e) {
			System.out.println("Somthing went wrong....");
		}
		finally {
			System.out.println("Program end");
		}
		
	}

}
