
package programs;

public class DuplicateStringInLine {

	public static void main(String[] args) {

		 String str ="Learn Java Learn Automation Learn Testing";
	       int count = 0;
	       str= str.toLowerCase(); 
	       
	       String word [] = str.split(" ");  
	    
			
			for(int i=0; i<word.length; i++) {
				count=1;
				for(int j=i+1; j<word.length; j++) {
					
						if(word[i].equals(word[j])) {    
		                    count++;    
		                    //Set words[j] to 0 to avoid printing visited word    
		                    word[j] = "0";    
		                }    
				}    
		                
		            //Displays the duplicate word if count is greater than 1    
		            if(count > 1 && word[i] != "0")  {  
		                System.out.println(word[i]);   } 
		        }  
		
		    }    
		}    
