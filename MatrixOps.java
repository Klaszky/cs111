public class MatrixOps
{
	public static void main(String[] args)
	{
		double[][] a = {
			{0, 1, 2, 5, 3, 6},
			{-2, 2, 3, 7,-2, 4},
			{0, 3, 4, 42, 6, 4}
		};

		double[][] b = {
			{1, 0, -2},
			{0, 3, -1},
			{3, 4, 6},
			{1, 3, 4},
			{5, 5, 6},
			{0, 0, 0}
		};

		double[][] c = multiply(a, b);

		if(c == null)
		{
			System.out.println("null");
		}
		else
		{
			ArrayMethods.prtArrD(c);
		}
	}

	public static double[][] multiply(double[][] A, double[][] B)
	{
		double[][] toReturn = new double[A.length][B[0].length];
		double sum = 0;

		for(int i = 0; i < A.length; i++)
		{
			if(A[i].length != B.length)
			{
				return null;
			}
		}

		for(int i = 0; i < B.length; i++)
		{
			if(B[i].length != A.length)
			{
				return null;
			}
		}


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