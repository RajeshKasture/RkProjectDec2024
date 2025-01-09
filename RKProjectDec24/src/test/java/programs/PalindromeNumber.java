package programs;

public class PalindromeNumber {

	public static void main(String[] args) {
	
		
		int n=151;
		int s=0,c,r;
		c=n;
		while(n>0) {
			
			r=n%10;
			s=s*10+r;
			n=n/10;
		
		}
		if(c==s) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a Palindrome number");
		}

	}

}
