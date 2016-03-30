public class MatrixOps
{
	public static void main(String[] args)
	{
		double[][] a = {
			{1, 0, 6},
			{0, 3, 9}
		};

		double[][] b = {
			{0, 3},
			{-2, -1},
			{0, 4}
		};

		double[][] c = multiply(a, b);

		// More2D.prtArrD(c);
	}

	public static double[][] multiply(double[][] A, double[][] B)
	{

		double[][] toReturn = new double[A.length][B[0].length];
		double sum = 0;

		for(int j = 0; j < B.length; j++)
		{
			if(A.length != B[j].length)
			{
				return null;
			}
		}

		for(int k = 0; k < A.length; k++)
		{
			if(A[k].length != B.length)
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