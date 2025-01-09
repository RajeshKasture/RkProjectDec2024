package programs;

public class LengthOfStringWithoutUsingLengthFunction {

	public static void main(String[] args) {
  
		int length = 0;
		String name="Rajesh";
		
		for(char c : name.toCharArray()) {
		length++;
		
		}
		
		System.out.print("Length of the string is : "+length);

		
	}

}
