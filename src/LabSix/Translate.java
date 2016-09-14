package LabSix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Translate {
   
	private static BufferedReader buf =new BufferedReader(new InputStreamReader(System.in));
	//create main and throws IOException so number and symbols not translated
	public static void main(String[] args)  { 
		// TODO Auto-generated method stub
		//declare instance variables
		String text="";
		String choice= "y";
		int index=0;
		
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//welcome user to Pig Latin Translator
		System.out.println("Welcome to the Pig Latin Translator! ");
		System.out.println();

		//while loop 
		while (choice.equalsIgnoreCase("y")) {
		//prompt the user for a word or sentence declare and initialize instance variables.
			
		
			// convert each word to a lowercase before translating
			System.out.println("Enter a  words or a sentence.");
		    String word = sc.nextLine().toLowerCase();
		    
		    

			

			

		
	

		for(int i= 0; i<1; i++){
			int x = text.length();
			
			
			

			
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
