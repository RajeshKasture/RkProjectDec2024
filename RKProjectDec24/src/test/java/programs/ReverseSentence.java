package programs;

public class ReverseSentence {

	public static void main(String[] args) {
		
		  String sentence ="My name is rajesh";
          String[] words = sentence.split(" ");
          
          for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
            
            
        }
	}

}
