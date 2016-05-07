import java.util.Arrays;

public class Sort
{

	public static void main(String[] args)
	{
		int[] a = ArrayMethods.fillOneD();
		a = mSort(a);
		ArrayMethods.printArr(a);
	}


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

	public static int[] mSort(int[] org)
	{
		// base case
		if(org.length == 1)
		{
			return org;
		}

		// breaks the array into halves then 
		// the recursive call happens on both sides
		// then they are merged and returned up
		//////////////////////////////////////////
		int[] left = Arrays.copyOfRange(org, 0, (org.length/2));
		int[] right = Arrays.copyOfRange(org, ((org.length/2)), org.length);

		left = mSort(left);
		right = mSort(right);

		return merge(left, right);
	}

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
	public static int[] merge(int[] a, int[] b)
	{
		// all these vars are used to keep track
		// of where the algorithms is and what is
		// being added to the return array
		////////////////////////////////////////
		int left = a.length;
		int lCounter = 0;
		int right = b.length;
		int rCounter = 0;
		int[] toReturn = new int[left + right];
		int counter = 0;

		// while there are still items in both
		// the left and right array, keep on 
		// keeping on...
		while(lCounter < left && rCounter < right)
		{
			if(a[lCounter] <= b[rCounter])
			{
				toReturn[counter] = a[lCounter];
				lCounter++;
				counter++;
			}
			else
			{
			toReturn[counter] = b[rCounter];
			rCounter++;
			counter++;
			}
		}

		// these two loops add whatever is left
		// over after one is array is empty 
		///////////////////////////////////////
		while(lCounter < left)
		{
			toReturn[counter] = a[lCounter];
			lCounter++;
			counter++;
		}

		while(rCounter < right)
		{

			toReturn[counter] = b[rCounter];
			rCounter++;
			counter++;
		}
		return toReturn;
	}
	
}