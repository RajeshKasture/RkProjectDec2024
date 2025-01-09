package programs;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Rajesh";
		String reverse ="";
		char c;
	
		for(int i=0; i<str.length(); i++)
		{
			c= str.charAt(i);
			reverse=c+reverse;
		}
		System.out.println(reverse);
		
	//	=========================================
		
		String s= "Kasture";
		
		StringBuilder sb = new StringBuilder();
		sb.append(s);
	    sb.reverse();
		System.out.println(sb);
	}

}
