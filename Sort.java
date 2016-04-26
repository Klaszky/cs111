public class Sort
{
	public static int[] iSort(int[] org)
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

		return org;
	}

	public static int[] sSort(int[] org)
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

		return org;
	}
}