import java.util.Random;

public class TwoDFunctions
{
	public static void main(String[] args)
	{
		// Random rando = new Random();

		// System.out.println(rando.nextInt(100));

		double[][] testD = 
		{
			{50,50,50},
			{60,60,60},
			{100,100,100}
		};

		String[] students = {"Manny", "Steven", "Joseph"};

		// System.out.println(totalAvg(testD));
		System.out.println(studentAvg(testD, students, "Joseph"));

		// double[][] testD = randomArrFillD();

		// String[] students = new String[testD.length];

		// for(int i = 0; i < students.length; i++)
		// {
		// 	students[i] = "Student " + (i+1);
		// }

		// studentAvg(testD, students);

		// System.out.println();

		// System.out.println(totalAvg(testD));


		// for(int i = 0; i < testD.length; i++)
		// {
		// 	for(int x = 0; x < testD[i].length; x++)
		// 	{
		// 		System.out.printf("%.2f ", testD[i][x]);
		// 	}

		// 	System.out.println();
		// }
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