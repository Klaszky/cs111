public class Sort
{
	public static void iSort(int[] org)
	{
		int itemsSorted;
		int temp;
		int loc;

		for(itemsSorted = 1; itemsSorted < org.length; itemsSorted++)
		{
			temp = org[itemsSorted];
			loc = itemsSorted - 1;

			while(loc >= 0 && org[loc] > temp)
			{
				org[loc + 1] = org[loc];
				loc--;
			}
			org[loc + 1] = temp;
		}
	}

	public static void sSort(int[] org)
	{
		int temp;
		int lowest;
		for(int i = 0; i < org.length-1 ; i++)
		{
			temp = org[i];
			lowest = i;

			for(int j = i+1; j < org.length; j++)
			{
				if(org[j] < org[lowest])
				{
					lowest = j;
				}
			}

			org[i] = org[lowest];
			org[lowest] = temp;
		}
	}

	// public static void mSort(int[] org)
	// {
	// 	if(a.length == 1)
	// 	{
	// 		return;
	// 	}
	// 	mergeSort(left);
	// 	mergeSort(right);
	// 	merge(left, right);
	// }

	public static int bSearch(int[] a, int num)
	{
		iSort(a);
		int upperBound = a.length-1;
		int lowerBound = 0;
		int midPoint = (upperBound + lowerBound) / 2;

		while(upperBound >= lowerBound)
		{
			if(num == a[midPoint])
			{
				return midPoint;
			}
			else if(num > a[midPoint])
			{
				lowerBound = midPoint + 1;
				midPoint = (upperBound + lowerBound) / 2;
			}
			else
			{
				upperBound = midPoint - 1; 
				midPoint = (upperBound + lowerBound) / 2;
			}
		}

		return -1;
	}

	// merge sort helper method
	// public static int[] merge(int[] a, int[] b)
	// {
	// 	int left = a.length;
	// 	int right = b.length;
	// 	int[] toReturn = new int[left + right];

		


	// }
	
}