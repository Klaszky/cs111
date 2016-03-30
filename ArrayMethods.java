import java.util.Random;


/*
A collection of array methods i've written for various reasons in class
that were in serveral diffent files. Some are ... less than useful.
*/

public class ArrayMethods
{

	public static double[][] multiply(double[][] A, double[][] B)
	{
		double[][] toReturn = new double[A.length][B[0].length];
		double sum = 0;

		for(int i = 0; i < A.length; i++)
		{
			for(int x = 0; x < A.length; x++)
			{
				for(int y = 0; y < A[i].length; y++)
				{
					sum += A[i][y] * B[y][x];
				}

				toReturn[i][x] = sum;
				sum = 0;
			}
		}

		return toReturn;
	}

	public static int[][] revArrOrd(int[][] mat)
	{
		int[][] toReturn = new int[mat.length][mat[0].length];
		for(int i = 0; i < mat.length; i++)
		{
			toReturn[i] = mat[mat.length-1-i];
		}

		return toReturn;
	}

	public static int[] revOrd(int[] row)
	{
		int[] toReturn = new int[row.length];
		for(int i = 0; i < row.length; i++)
		{
			toReturn[i] = row[row.length-1-i];
		}

		return toReturn;
	}

	public static int[][] turnNinety(int[][] arr)
	{
		arr = revArrOrd(arr);

		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = revOrd(arr[i]);
		}

		return arr;
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

	public static double classAvg(double[][] grades)
	{
		double avg, totalAvg = 0;
		int counter, numStudents = grades.length;
		for(int i = 0; i < grades.length; i++)
		{
			avg = 0;
			for(int x = 0; x < grades[i].length; x++)
			{
				avg += grades[i][x];
			}

			avg /= grades[i].length;

			totalAvg += avg;

		}

		return totalAvg /= numStudents;
	}

	// same method as one above, just does it a bit differently.
	public static double totalAvg(double[][] grades)
	{
		double total = 0;
		int count = 0;
		for(int i = 0; i < grades.length; i++)
		{
			for(int x = 0; x < grades[i].length; x++)
			{
				total += grades[i][x];
				count++;
			}

		}

		return total /= count;
	}

	public static void studentAvg(double[][] grades, String[] students)
	{
		double avg;
		for(int i = 0; i < students.length; i++)
		{
			avg = 0;
			for(int x = 0; x < grades[i].length; x++)
			{
				avg += grades[i][x];
			}

			avg /= grades[i].length;

			System.out.printf("%s's avg: %-2.2f", students[i], avg);
			System.out.println();
		}
	}

	public static double studentAvg(double[][] grades, String[] roster, String name)
	{
		int i;

		for(i = 0; i < roster.length; i++)
		{
			if(name.equals(roster[i]))
			{
				break;
			}
		}

		if(i == roster.length)
		{
			return -1;
		}

		double total = 0.0;
		for(int j = 0; j < grades[i].length; j++)
		{
			total += grades[i][j];
		}

		total /= grades[i].length;

		return total;
	}

	public static int[][] randomArrFill()
	{
		Random rand = new Random();
		int[][] toReturn = new int[rand.nextInt(50)][rand.nextInt(50)];
		for(int i = 0; i < toReturn.length; i++)
		{
			for(int x = 0; x < toReturn[i].length; x++)
			{
				toReturn[i][x] = rand.nextInt(100);
			}
		}
		return toReturn;
	}

	public static double[][] randomArrFillD()
	{
		Random rand = new Random();
		double[][] toReturn = new double[rand.nextInt(50)][rand.nextInt(50)];
		for(int i = 0; i < toReturn.length; i++)
		{
			for(int x = 0; x < toReturn[i].length; x++)
			{
				toReturn[i][x] = rand.nextDouble()*100;
			}
		}
		return toReturn;
	}
}