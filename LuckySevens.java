//LuckySevens.java

public class LuckySevens{
	
	public static void main(String[] args){

		System.out.println("java LuckySevens");

		int lowerBound, upperBound, lenString, numberOfSevens = 0;
		String len;

		System.out.print("Enter a lower bound: ");
		lowerBound = IO.readInt();
		System.out.print("Enter an upper bound: ");
		upperBound = IO.readInt();

		for(int number = lowerBound; number <= upperBound; number++){

			//getting an infinite loop.... need to adjust logic
			while(number != 0){
				if (number % 10 == 7 || number == 7){
					numberOfSevens++;
				}

				number /= 10;

				System.out.println(number);
			}
		}

		IO.outputIntAnswer(numberOfSevens);
	}		
}