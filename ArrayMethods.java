import java.util.Random;


/*
A collection of array methods i've written for various reasons in class
that were in serveral diffent files. Some are ... less than useful.
*/


public class ArrayMethods
{
	// for testing
	public static void main(String[] args)
	{
		int[][] rando = fillArr(2, 10, 15);
		prtArrI(rando);

		System.out.println(countZ(rando));
		System.out.println(countO(rando));

		int[][] gradesArr = fillArr(101, 10, 11);

		prtArrI(gradesArr);

		grades(gradesArr);
	}


	//homework assignment.
	public static double[][] multiply(double[][] A, double[][] B)
	{
		
		double sum = 0;
		int rowsInA = A.length, rowsInB = B.length;
		int colsInA = A[0].length, colsInB = B[0].length;

		double[][] toReturn = new double[rowsInA][colsInB];

		if(colsInA != rowsInB)
		{
			return null;
		}


		for(int i = 0; i < rowsInA; i++)
		{
			for(int j = 0; j < colsInB; j++)
			{
				for(int k = 0; k < rowsInB; k++)
				{
					sum += (A[i][k] * B[k][j]);
				}

				toReturn[i][j] = sum;
				sum = 0;
			}
		}

		return toReturn;
	}

	//takes an array of arrays and puts it in order
	//from last to first
	public static int[][] revArrOrd(int[][] mat)
	{
		int[][] toReturn = new int[mat.length][mat[0].length];
		for(int i = 0; i < mat.length; i++)
		{
			toReturn[i] = mat[mat.length-1-i];
		}

		return toReturn;
	}

	//takes an array and and returns it reversed
	public static int[] revOrd(int[] row)
	{
		int[] toReturn = new int[row.length];
		for(int i = 0; i < row.length; i++)
		{
			toReturn[i] = row[row.length-1-i];
		}

		return toReturn;
	}

	//uses revOrd and revArrOrd to turn an array
	//90 degrees
	public static int[][] turnNinety(int[][] arr)
	{
		arr = revArrOrd(arr);

		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = revOrd(arr[i]);
		}

		return arr;
	}

	//fills an array of user chosen size with random numbers
	//up to a user defined limit
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

	//i am tired of writing nested for loops to 
	//print out my twoD arrays so this does that for me
	//I tried to write an overloaded method, but I
	//couldn't get it to work correctly
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

	//same as prtArrD except with ints
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

	//oneD array
	public static void printArr(int[] inputArr)
	{
		for(int i = 0; i < inputArr.length; i++)
		{
			System.out.println(inputArr[i]);
		}
		System.out.println();
	}

	//counts number of zeros in an array of arrays
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

	//counts number of ones in an array of arrays
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

	//does avg grade and drops lowest
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

	//finds and returns lowest number in an array
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

	//goes over a twoD array and avgers all te numbers
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

	//Spits out the avgs for all students
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

	//returns the avg of a specific student
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

	//fills an array of arrays with a random size with
	//random numbers up to 100
	public static int[][] randomArrFill()
	{
		Random rand = new Random();
		int[][] toReturn = new int[rand.nextInt(50)][rand.nextInt(50)];
		for(int i = 0; i < toReturn.length; i++)
		{
			for(int x = 0; x < toReturn[i].length; x++)
			{
				toReturn[i][x] = rand.nextInt(101);
			}
		}
		return toReturn;
	}

	public static int[] fillOneD()
	{
		Random rand = new Random();
		int[] toReturn = new int[rand.nextInt(1000)];
		for(int i = 0; i < toReturn.length; i++)
		{
			toReturn[i] = rand.nextInt(5000);
		}

		return toReturn;
	}

	//same as above, but with doubles
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