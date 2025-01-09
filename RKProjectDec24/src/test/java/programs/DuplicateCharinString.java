package programs;

public class DuplicateCharinString {

	public static void main(String[] args) {

       String str ="Rajesh Kasture";
       int count = 0;
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			
			for(int j=i+1; j<ch.length; j++) {
				
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate char is :"+ch[j]);
					
					count++;
				}
			}	
		}
		System.out.println("Count of duplicate char is :"+count);
	
	}

}
