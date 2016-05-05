public class StringRec
{
	public static String decompress(String compressedText)
	{
		// Base Case
		// If the string only has one char it just returns
		// what it was passed to stop the recursion.
		//////////////////////////////////////////////////
		if(compressedText.length() == 1 || compressedText.length() == 0)
		{
			return compressedText;
		}

		// Kind of convoluted, but this uses the Character
		// class' function .isLetter to see if the first
		// char of the string is a number.
		//////////////////////////////////////////////////
		if(!Character.isLetter(compressedText.charAt(0)))
		{	
			// Gets the number that's in the first position
			char c = compressedText.charAt(0);

			// If the number is greater than 1 it gets decremented
			// the letter that follows gets returned and 
			// decompress gets called again
			if(c > '1')
			{
				c--;
				compressedText = "" + c + compressedText.substring(1);
				return compressedText.substring(1,2) + decompress(compressedText);
			}

			// When the number is 1  it just returns the letter that follows
			// and calls decompress on a substring that starts after the
			// current letter.
			return compressedText.substring(1,2) + decompress(compressedText.substring(2));
		}

		// If it's a letter with no number before it just returns
		// the letter and calls decompress on a substring of
		// everything that follows the current letter.
		return compressedText.substring(0,1) + decompress(compressedText.substring(1));
	}
}