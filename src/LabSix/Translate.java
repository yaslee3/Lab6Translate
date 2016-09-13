package LabSix;

import java.util.Scanner;

public class Translate {
   
	
	//create main and throws IOException so number and symbols not translated
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String choice= "y";
		
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//while loop 
		while (choice.equalsIgnoreCase("y")) {
		//prompt the user for a word or sentence declare and initialize instance variables.
		
		System.out.println("Enter  words.");
		String word = sc.nextLine();
		
		
		// create a  'for-loop', set the int variable  
		
		for(int i= 0; i<1; i++){
			int x = word.length();
			
			//if statement for if a word starts with a vowel, just add way onto the ending 
			if (word.charAt(0)=='a' || word.charAt(0)=='e'|| word.charAt(0)=='i'|| word.charAt(0)=='o'|| word.charAt(0)=='u')
            {

	word=word+"way";
            }
			
			 //if a word starts with a consonant, move all of the consonants that appear before the first vowel to the end of the word then add "ay" to end     
            else {	
	
	char firstletter = word.charAt(0);
        word = word.substring(1) +  word.charAt(0) + "ay";
}
			
			System.out.print(word);
			
		}
		
		System.out.println();
		System.out.print("Translate another word? (y/n):");
		 choice = sc.nextLine();
		}
		System.out.println("Bye!");
		
	}

}
