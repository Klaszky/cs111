// Sum.java

public class Sum{

	public static void main(String[] args){

		int number1, number2, sum;

		//welcome message
		System.out.println("java Sum\n");

		System.out.print("Enter number: ");
		number1 = IO.readInt();

		System.out.print("Enter number: ");
		number2 = IO.readInt();

		sum = number1 + number2;

		System.out.println("");

		IO.outputIntAnswer(sum);

	}
}