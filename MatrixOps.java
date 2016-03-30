public class MatrixOps
{
	public static void main(String[] args)
	{
		double[][] a = {
			{1, 0, -2},
			{0, 3, -1}
		};

		double[][] b = {
			{0, 3},
			{-2, -1},
			{0, 4}
		};

		double[][] c = multiply(a, b);

		More2D.prtArrD(c);
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