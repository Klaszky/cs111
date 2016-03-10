//Compress.java

public class Compress
{

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