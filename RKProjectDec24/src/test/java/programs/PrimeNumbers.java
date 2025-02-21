package programs;

public class PrimeNumbers {

	public static void main(String[] args) {
		int counter=0;
		int count =45;
		int c=0;
		int n= 43;
	for (int i=1; i<count; i++) {
	
		if(n%i==0)
		{
			counter++;	
		}
	}
	if(counter==2)
	{
		System.out.println("Prime number");
		
	}
		else
		{System.out.println("Not a prime number");}
	
	//===================================================
	System.out.println("================================");
	  for(int i=2; i<=29; i++)
      {
        int  chk = 0;
         for(int j=2; j<i; j++)
         {
            if(i%j==0)
            {
               chk++;
               break;
            }
         }
         if(chk==0)
            System.out.print(i+" ");
      }
}
}


