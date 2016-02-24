//LuckySevens.java

public class LuckySevens{
	
	public static void main(String[] args){

		System.out.println("java LuckySevens");

		int lowerBound, upperBound, testNum, numberOfSevens = 0;

		//gets bounds for loop
		System.out.print("Enter a lower bound: ");
		lowerBound = IO.readInt();
		System.out.print("Enter an upper bound: ");
		upperBound = IO.readInt();

		if(lowerBound > upperBound){
			IO.reportBadInput();
			return;
		}
		for(int number = lowerBound; number <= upperBound; number++){

			testNum = number;

			while(testNum != 0){
				if (testNum % 10 == 7 || testNum % 10 == -7){
					numberOfSevens++;
				}

				testNum /= 10;
			}
		}

		IO.outputIntAnswer(numberOfSevens);
	}		
}