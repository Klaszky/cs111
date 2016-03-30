public class Arrofarr
{
	public static void main(String[] args)
	{
		int[][] matrix = {
			{4,3,5,6},
			{1,5,8,2},
			{4,7,1,0},
			{5,1,5,8},
			{1,8,4,2}
		};
		int col = matrix.length;
		int row;

		matrix = turnNinety(matrix);

		for(int i = 0; i < col; i++)
		{
			row = matrix[i].length;
			for(int x = 0; x < row; x++)
			{
				System.out.print(matrix[i][x]);
			}
			System.out.println();
		}

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
}