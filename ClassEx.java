public class ClassEx
{
	public static void main(String[] args)
	{
		String[] nets = {"A", "B", "C", "D"};
		int[] chans = {2, 15, 20, 34};

		System.out.println(networkLookup(nets, chans, "C"));
		
		int[] set1 = {1, 2, 3, 4, 5};
		int[] set2 = {3, 5, 7, 9, 11};

		System.out.println(overlap(set1, set2));	
	}

	public static int networkLookup(String[] nets, int[] chans, String network)
	{
		for(int i = 0; i < nets.length; i++)
		{
			if(nets[i].equals(network))
				return chans[i];
		}

		return -1;
	}

	public static int overlap(int[] set1, int[] set2)
	{
		int counter = 0;

		for(int i : set1)
		{
			for(int x = 0; x < set2.length; x++)
			{
				if(i == set2[x])
				{
					counter++;
					continue;
				}
			}
		}
		return counter;
	}
}
