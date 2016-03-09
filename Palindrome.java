public class Palindrome
{
	public static boolean isPalindrome(String word)
	{
		int leftCounter = 0, rightCounter = word.length()-1;

		for(int i = 0; i < word.length()/2 ; i++)
		{

			while( !isAlpha(word.substring(rightCounter, rightCounter+1)) )
			{
				rightCounter--;
			}
			while( !isAlpha(word.substring(leftCounter, leftCounter+1)) )
			{
				leftCounter++;
			}
			
			if(word.substring(leftCounter, leftCounter+1).equalsIgnoreCase(word.substring(rightCounter, rightCounter+1)))
			{
				leftCounter++;
				rightCounter--;
				continue;
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}

	//This function is shameslessly stolen from Stackexchange user "adarshr"
	public static boolean isAlpha(String name)
	{
		char[] chars = name.toCharArray();

		for(char c : chars) 
		{
			if(!Character.isLetter(c))
			{
				return false;
			}
		}

		return true;
	}
}
