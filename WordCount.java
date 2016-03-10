//WordCount.java

public class WordCount
{

	public static int countWords(String original, int minLength)
	{
		int counter = 0;
		for(String str: original.split(" "))
		{
			System.out.println(str);
			if(countLetters(str) >= minLength)
			{
				counter++;
			}
		}
		return counter;
	}
	
	public static int countLetters(String word)
	{
		int letterCounter = 0;
		for(int i = 0; i < word.length(); i++)
		{
			if( Character.isLetter(word.charAt(i)) )
			{
				letterCounter++;
			}
		}
		return letterCounter;
	}
}
