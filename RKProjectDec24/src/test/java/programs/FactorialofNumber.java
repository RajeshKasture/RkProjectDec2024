package programs;

public class FactorialofNumber {

	public static void main(String[] args) {
		int factorial =1;
		int num= 4;
		
		for(int i=1; i<=num; i++) {
			 factorial = factorial * i;	 
			 
		}
		System.out.println(factorial);
	}

}
