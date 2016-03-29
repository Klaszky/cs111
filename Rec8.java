public class Rec8
{
	public static void main(String[] args)
	{
		// Testing the reverse method
		// String str = "hello";
		// String[] strArr = toStrArr(str);

		// Testing the reverse string method
		// String revArr = revStrArr(strArr);
		// System.out.println(revArr);

		// Testing the average method
		// int[] nums = {90, 90, 80, 70};
		// System.out.println(avg(nums));

		// Testing reverse int method
		// System.out.println(reverseInt(0));
		// System.out.println(reverseInt(-1234));
		// System.out.println(reverseInt(1));
		// System.out.println(reverseInt(12));

		// Testing the oneEighty methods
		// int[] toRotate = {
		// 				4356,
		// 				1582,
		// 				4710,
		// 				5158,
		// 				1842
		// 					};
		// String[] newRot = oneEighty(toRotate);

		// String[] toRotate2 = {
		// 				"4356",
		// 				"1582",
		// 				"4710",
		// 				"5158",
		// 				"1842"
		// 					};

		// String[] newRot2 = oneEighty(toRotate2);

		// for(String i : newRot)
		// {
		// 	System.out.println(i);
		// }

		// System.out.println();

		// for(String i : newRot2)
		// {
		// 	System.out.println(i);
		// }

		return;
	}

	// takes a string and puts every character into an array of strings
	public static String[] toStrArr(String str)
	{
		String[] toReturn = new String[str.length()];
		for(int i = 0; i < str.length(); i++)
		{
			toReturn[i] = str.substring(i, i+1);
		}

		return toReturn;
	}

	// takes an array of strings, puts them all in one string and
	// reverses it
	public static String revStrArr(String[] strArr)
	{
		String toReturn = "";

		for(int i = strArr.length-1; i >= 0; i--)
		{
			toReturn += strArr[i];
		}

		return toReturn;
	}

	// averages an array of ints
	public static int avg(int[] nums)
	{
		int toReturn = 0;
		for(int i = 0; i < nums.length; i++)
		{
			toReturn += nums[i];
		}

		toReturn /= nums.length;

		return toReturn;
	}

	// gets length of an int
	public static int intLen(int num)
	{
		int counter = 0;
	
		do
		{
			num /= 10;
			counter++;
		}while(num != 0);

		return counter;
	}

	// meh works, but not the way I need it too.
	public static int reverseInt(int num)
	{
		int len = intLen(num);
		int toReturn = 0;
		int[] temp = new int[len];

		for(int i = len-1; i >= 0; i--)
		{
			temp[i] = num % 10;
			num /= 10;
		}

		for(int i = 0; i < len; i++)
		{
			toReturn += temp[i]*Math.pow(10, i);
		}

		return toReturn;
	}

	// turns an array of ints into an array of strings that are
	// flipped and reversed
	public static String[] oneEighty(int[] orig)
	{
		int counter = 0;
		String[] toStr = intToString(orig);
		String[] toReturn = new String[toStr.length];

		for(int i = toStr.length-1; i >= 0; i--)
		{
			toReturn[counter] = toStr[i];
			counter ++;
		}

		for(int i = 0; i < toReturn.length; i++)
		{
			toReturn[i] = StringMethods.reverse(toReturn[i]);
		}

		return toReturn;
	}

	// turns an array of ints one hundrend and 80 degrees
	public static String[] oneEighty(String[] orig)
	{
		int counter = 0;
		String[] toReturn = new String[orig.length];

		for(int i = orig.length-1; i >= 0; i--)
		{
			toReturn[counter] = orig[i];
			counter ++;
		}

		for(int i = 0; i < toReturn.length; i++)
		{
			toReturn[i] = StringMethods.reverse(toReturn[i]);
		}

		return toReturn;
	}

	// converts an array of ints to an array of strings
	public static String[] intToString(int[] orig)
	{
		String[] toReturn = new String[orig.length];
		for(int i = 0; i < orig.length; i++)
		{
			toReturn[i] = Integer.toString(orig[i]);
		}

		return toReturn;
	}
}
