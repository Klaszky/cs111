import java.util.Random;

public class More2D
{
	public static void main(String[] args)
	{
		// int[][] rando = fillArr(2, 10, 10);
		int[][] rando2 = fillArr(100, 6, 6);

		prtArrI(rando2);

		grades(rando2);

		// prtArrI(rando);

		// System.out.printf("0s = %d \n1s = %d \n", countZ(rando), countO(rando));

	}


	public static int[][] fillArr(int maxNum, int row, int col)
	{
		Random rand = new Random();

		int[][] toReturn = new int[row][col];
		for(int i = 0; i < toReturn.length; i++)
		{
			for(int j = 0; j < toReturn[i].length; j++)
			{
				toReturn[i][j] = rand.nextInt(maxNum);
			}
		}

		return toReturn;
	}

	public static void prtArrD(double[][] inputArr)
	{
		for(int i = 0; i < inputArr.length; i++)
		{
			for(int j = 0; j < inputArr[i].length; j++)
			{
				System.out.print(inputArr[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static void prtArrI(int[][] inputArr)
	{
		for(int i = 0; i < inputArr.length; i++)
		{
			for(int j = 0; j < inputArr[i].length; j++)
			{
				System.out.print(inputArr[i][j] + " ");
			}

			System.out.println();
		}
	}


	public static int countZ(int[][] inputArr)
	{
		int numOfZeros = 0;
		for(int i = 0; i < inputArr.length; i++)
		{
			for(int j = 0; j < inputArr[i].length; j++)
			{
				if(inputArr[i][j] == 0)
				{
					numOfZeros++;
				}
			}
		}

		return numOfZeros;
	}

	public static int countO(int[][] inputArr)
	{
		int numOfOnes = 0;
		for(int i = 0; i < inputArr.length; i++)
		{
			for(int j = 0; j < inputArr[i].length; j++)
			{
				if(inputArr[i][j] == 1)
				{
					numOfOnes++;
				}
			}
		}

		return numOfOnes;
	}

	public static void grades(int[][] inputArr)
	{
		int div, sum = 0;
		double avg;
		for(int i = 0; i < inputArr.length; i++)
		{
			for(int j = 0; j < inputArr[i].length; j++)
			{
				sum += inputArr[i][j];
			}

			div = inputArr[i].length - 1;
			sum -= lowest(inputArr[i]);
			avg = (double)sum/div;

			System.out.printf("Student %d's avg = %.2f\n", i+1, avg);

			sum = 0;
			avg = 0;
		}
	}

	public static int lowest(int[] inputArr)
	{
		int lowest = inputArr[0];
		for(int i = 0; i < inputArr.length; i++)
		{
			if(inputArr[i] < lowest)
			{
				lowest = inputArr[i];
			}
		}

		return lowest;
	}
}