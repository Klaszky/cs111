public class testEx
{
	public static void main(String[] args)
	{

		int numInput;
		System.out.print("Enter an integer: ");
		numInput = IO.readInt();

		while(numInput != 0)
		{
			if(numInput % 10 == 5 || numInput % 10 == -5)
			{
				System.out.println("Bad number");
				return;
			}

			numInput /= 10;
		}

		System.out.println("Good number");
	}
}