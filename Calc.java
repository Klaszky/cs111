//Calc.java
public class Calc{
	
	public static void main(String[] args){

		int selection;

		System.out.println("Mediocre Calculator");

		System.out.println("\nEnter the number for your selection:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("0. To exit")
;
		System.out.print(">> ");
		selection = IO.readInt();

		while (selection < 0 || selection > 4){
			System.out.println("Sorry, enter a number from the menu");

			System.out.print(">> ");
			selection = IO.readInt();		
		}

		if (selection == 1){

			double add1, add2, sum;
			
			System.out.print("\nEnter first number to add: ");
			add1 = IO.readDouble();

			System.out.print("Enter second number to add: ");
			add2 = IO.readDouble();

			sum = add1 + add2;

			System.out.println("Answer: " + sum + "\n");

		}else if (selection == 2){

			double sub1, sub2, difference; 

			System.out.print("\nEnter number to subtract from: ");
			sub1 = IO.readDouble();

			System.out.print("Enter number to subtract: ");
			sub2 = IO.readDouble();

			difference = sub1 - sub2;

			System.out.println("Answer: " + difference + "\n");


		}else if (selection == 3){

			double mult1, mult2, product;

			System.out.print("\nEnter first number to multiply: ");
			mult1 = IO.readDouble();

			System.out.print("Enter second number to multiply: ");
			mult2 = IO.readDouble();

			product = mult1 * mult2;

			System.out.println("Answer: " + product + "\n");

		}else if (selection == 4){

			double dividend, divisor, quotient;

			System.out.print("\nEnter dividend: ");
			dividend = IO.readDouble();

			System.out.print("Enter divisor: ");
			divisor = IO.readDouble();

			quotient = dividend / divisor;

			System.out.println("Answer: " + quotient + "\n");

		}else if (selection == 0){

			System.out.println("\nSo long, and thats for all the fish.\n");
			return;
		}
	}
}