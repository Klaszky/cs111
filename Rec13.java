public class Rec13
{
	public static void main(String[] args)
	{
		String s = "amanaplanacanalpanama";

		System.out.println(isPalindrome(s));
	}
	public static String revStrR(String input)
	{
		if(input.length() == 1)
		{
			return input;
		}
		else
		{
			return revStrR(input.substring(1)) + input.substring(0, 1);
		}
	}

	public static boolean isPalindrome(String input)
	{

		if(input.length() == 1 || input.length() == 2)
		{
			if(input.substring(0,1).equalsIgnoreCase(input.substring(input.length()-1, input.length())))
			{
				return true;
			}
		}

		if(input.substring(0,1).equalsIgnoreCase(input.substring(input.length()-1, input.length())))
		{
			return isPalindrome(input.substring(1,input.length()-1));
		}
		
		return false;

	}
}