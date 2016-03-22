public class Rec8
{
	public static void main(String[] args)
	{
		String str = "hello";
		String[] strArr = toStrArr(str);
		for(int i = 0; i < strArr.length; i++)
			System.out.print(strArr[i]);
		String revArr = revStrArr(strArr);
		System.out.println();
		System.out.println(revArr);
		System.out.println();
		int[] nums = {90, 90, 80, 70};
		System.out.println(avg(nums));
		System.out.println();
	}

	public static String[] toStrArr(String str)
	{
		String[] toReturn = new String[str.length()];
		for(int i = 0; i < str.length(); i++)
		{
			toReturn[i] = str.substring(i, i+1);
		}

		return toReturn;
	}

	public static String revStrArr(String[] strArr)
	{
		String toReturn = "";

		for(int i = strArr.length-1; i >= 0; i--)
		{
			toReturn += strArr[i];
		}

		return toReturn;
	}

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

	public static int intLen(int num)
	{
		counter = 0;
		while(num != 0)
		{
			num /= 10;
			counter++;
		}
		return counter;
	}

	public static int reverseInt(int num)
	{
		len = intLen(num);
		int toReturn = 0;
		int[] temp = new int[len];

		for(int i = len-1; i >= 0; i--)
		{
			temp[i] = num % 10;
			num /= 10;
		}

		for(int i = 0; i < len; i++)
		{
			toReturn += temp[i]*math.pow(10, i);
		}

		return toReturn;
	}
}
