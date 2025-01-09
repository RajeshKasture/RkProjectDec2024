package programs;

public class LargestofthreeNumbers {

	public static void main(String[] args) {

int a=900, b=500, c=5900;

if(a>c && a>b) 
	
	System.out.println("A is largest number");	

	else if (b>a && b>c)
	
		System.out.println("B is largest number");	
		
	else if (c>a && c>b)
	
		System.out.println("C is largest number");	
	

// By using other way


int num1 = 10, num2 = 20, num3 = 15;
int largest = Math.max (Math.max(num1, num2), num3);

System.out.println("The largest number is: " + largest);
		
	}

}
