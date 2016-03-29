public class MatrixOps
{
	public static void main(String[] args)
	{
		double[][] a = {
			{1, 2, 3, 4},
			{3, 4, 5, 6},
			{5, 6, 7, 8},
			{7, 8, 9, 10}
		};

		double[][] b = {
			{7, 8, 9, 10},
			{10, 11, 12, 13},
			{14, 15,16, 17},
			{18, 19, 20, 21}
		};

		double[][] c = multiply(a, b);

		for(int i = 0; i < c.length; i++)
		{
			for(int x = 0; x < c[i].length; x++)
			{
				System.out.print(c[i][x] + " ");
			}
			System.out.println();
		}
	}

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
}