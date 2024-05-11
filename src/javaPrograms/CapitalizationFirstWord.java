package javaPrograms;

public class CapitalizationFirstWord {

	public static void main(String[] args) {
		
		String s= "the quick brown fox jumps over the lazy dog";
		
		String [] words=s.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			String firstLetter=words[i].substring(0,1);
			String restOfLetters=words[i].substring(1);
			
			firstLetter=firstLetter.toUpperCase();
			
			words[i]= firstLetter+restOfLetters;
			System.out.print(words[i]+" ");
			
			
		}
		System.out.println("\n");
		
		System.out.println("=================================================");
		
		String s1= "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";

		String [] words1= s.split(" ");

		for(int i=0;i<words1.length;i++)
		{
			String lower=words1[i].toLowerCase();
			System.out.print(lower+" ");
		}
	
	}

}
