//StringMethods.java
public class StringMethods
{
	//works pretty well, ignores caps and non letter chars
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

	//works, but it isn't flexible at all
	public static boolean shittyIsAnagram(String sOne, String sTwo)
	{

		if(sOne.length() != sTwo.length())
		{
			return false;
		}

		int counter = 0;
		char[] sOneChar = sOne.toCharArray(), sTwoChar =sTwo.toCharArray();
		
		for(char c : sOneChar)
		{
			counter = 0;
			for(char d: sTwoChar)
			{
				if(d == c)
				{
					sTwoChar[counter] = ' ';
					break;
				}
				counter++;
			}
		}

		for(char e : sTwoChar)
		{
			if(e != ' ')
			{
				return false;
			}
		}

		return true;
	}

	//gets rid of all chars that aren't letters
	public static String stripNonAlpha(String toStrip)
	{
		toStrip = toStrip.trim();
		toStrip = toStrip.toLowerCase();

		for(int i = 0; i < toStrip.length(); i++)
		{
			if( !isAlpha(toStrip.substring(i, i+1)) )
			{
				toStrip = toStrip.substring(0, i) + toStrip.substring(i+1, toStrip.length());
				i--;
			}
		}

		return toStrip;
	}
	
	/**
	 * strips all non letter chars, makes sure they are the same length
	 * then goes through both strings cutting out letters from the second
	 * if they are also in the first string. Could be optimized ... a lot....
	 */

	public static boolean isAnagram(String sOne, String sTwo)
	{
		//gets rid of all non letters to make it easier to check
		sOne = stripNonAlpha(sOne);
		sTwo = stripNonAlpha(sTwo);

		if(sOne.length() != sTwo.length())
		{
			return false;
		}

		//not great, but it works
		for(int i = 0; i < sOne.length(); i++)
		{
			for(int x = 0; x < sTwo.length(); x++)
			{
				//if a letter from string one is the same as one in strig two
				//it cuts it out and makes a new string minus that letter
				if( sTwo.charAt(x) == sOne.charAt(i) )
				{
					sTwo = sTwo.substring(0, x) + sTwo.substring(x+1, sTwo.length());
					break;
				}

			}
		}
		
		//if all letter shave been cut then they are the same
		if(sTwo.length() == 0)
		{
			return true;
		}

		return false;
	}

	public static String longestSeq(String str)
	{
		String biggest = "", current = str.substring(0, 1);
		for(int i = 1; i < str.length(); i++)
		{
			if(str.charAt(i) == str.charAt(i-1))
			{
				current = current + str.substring(i, i+1);
			}
			else
			{
				if(current.length() > biggest.length())
				{
					biggest = current.substring(0, current.length());
					current = str.substring(i, i+1);
				}
				else
				{
					current = str.substring(i, i+1);	
				}
			}
		}
		return biggest;
	}

	public static String reverse(String str)
	{
		String toReturn = "";
		for(int i = str.length(); 0 < i; i--)
		{
			toReturn = toReturn + str.substring(i-1, i);
		}

		return toReturn;
	}

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

	public static String compress (String original)
	{
		int counter = 1;
		String compressed = "";

		if(original.length() == 1)
		{
			return original;
		}

		for(int i = 0; i < original.length(); i++)
		{
			if(i == original.length()-1)
			{
				if(original.charAt(i) == original.charAt(i-1))
				{
					compressed = compressed  + counter + original.substring(i-1, i);
				}
				else
				{
					compressed = compressed + original.substring(i, i+1);
				}
			}
			else if( original.charAt(i) == original.charAt(i+1) )
			{
				counter++;
			}
			else
			{
				if(counter > 1)
				{
					compressed = compressed + counter + original.substring(i, i+1);
					counter = 1;
				}
				else
				{
					compressed = compressed + original.substring(i, i+1);
				}
			}
		}
		
		return compressed;
	}
}