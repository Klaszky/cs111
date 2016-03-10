//PigLatin.java

public class PigLatin
{
	public static String translate (String original)
	{
		boolean vowel = false;
		
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};

		for(char c: vowels)
		{
			if(c == original.toLowerCase().charAt(0))
			{
				vowel = true;
				break;
			}
		}

		if(vowel)
		{
			return original + "way";
		}
		else
		{
			return original.substring(1, original.length()) + original.substring(0, 1) + "ay";
		}
	}
}
