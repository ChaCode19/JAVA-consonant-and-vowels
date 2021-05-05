package JOptionpane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class DisplayvowelsConsonant {

	public static void main(String[] args) {
		
		 String s = JOptionPane.showInputDialog(null, "Enter a String: ");
	     String words = s;
		 
		 int l_word = words.length();
	        int no_of_vowels = 0;
	        int no_of_consonants = 0;
	        
	        List chars = new ArrayList(); // ['o', 'i']
	        
	        // Good Morning Philippines
	        for (int i = 0; i < l_word; i++) {
	            
	            // Check if the letter is vowel
	            if (words.charAt(i) == 'A' || words.charAt(i) == 'a' || 
	                words.charAt(i) == 'E' || words.charAt(i) == 'e' ||
	                words.charAt(i) == 'I' || words.charAt(i) == 'i' ||
	                words.charAt(i) == 'O' || words.charAt(i) == 'o' ||
	                words.charAt(i) == 'U' || words.charAt(i) == 'u') {
	               
	            	int cnt = 0;
	                
	                no_of_vowels += 1;
	                
	                // Convert Big letter to small letter and check from array if the letter exist
	                if (chars.contains(Character.toString(Character.toLowerCase(words.charAt(i))))) {
	                    continue;
	                } else { // If not exist add the letter to Array List
	                    chars.add(Character.toString(Character.toLowerCase(words.charAt(i))));
	                }
	                
	                // Loop the whole words by character to check if the letter is repeated
	                for (int j = 0; j < words.length(); j++) {
	                    if (Character.toLowerCase(words.charAt(i)) == Character.toLowerCase(words.charAt(j))) {
	                        cnt++;
	                    }
	                }
	                
	                // Check only repeated character more than one
	                if(cnt > 1){
	                	 JOptionPane.showMessageDialog(null,"Vowels that appear more than 1's: "  +words.charAt(i) + " - " + cnt);
	                }
	                
	            } else { // else the letter is consonant
	                if (words.charAt(i) != ' ') {
	                    no_of_consonants += 1;
	                }
	            }
	        }
	        
	        JOptionPane.showMessageDialog(null,"No. of vowels " + no_of_vowels);
	        JOptionPane.showMessageDialog(null, "No. of consonants " + no_of_consonants);
	    }
	{
		
	System.exit(0);
	}

}
		

	
