public class MatrixOps
{
	// public static void main(String[] args)
	// {
	// 	double[][] a = {
	// 		{0, 1, 2, 5, 3, 6},
	// 		{-2, 2, 3, 7,-2, 4},
	// 		{0, 3, 4, 42, 6, 4}
	// 	};

	// 	double[][] b = {
	// 		{1, 0, -2},
	// 		{0, 3, -1},
	// 		{3, 4, 6},
	// 		{1, 3, 4},
	// 		{5, 5, 6},
	// 		{0, 0, 0}
	// 	};

	// 	double[][] c = multiply(a, b);

	// 	if(c == null)
	// 	{
	// 		System.out.println("null");
	// 	}
	// 	else
	// 	{
	// 		ArrayMethods.prtArrD(c);
	// 	}
	// }

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
}