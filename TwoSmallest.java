//TwoSmallest.java

public class TwoSmallest{
	
	public static void main(String[] args){

		int counter = 0;

		double sentinel, input, lowest = -99999999, secondLowest= -99999999;

		System.out.print("Enter a number. This that will end the program: ");
		sentinel = IO.readDouble();

		System.out.println("Enter a series of numbers and I'll out the two lowest numbers.");

		do{
			System.out.print(">> ");
			input = IO.readDouble();
			if(input != sentinel){
				if(counter == 0){
					lowest = input;
				}else if(counter == 1 && input >= lowest){
					secondLowest = input;
				}

				if(input < lowest){
					secondLowest = lowest;
					lowest = input;
				}else if(input <= secondLowest){
					secondLowest = input;
				}

				counter++;
			}

		}while(counter < 2 || input != sentinel);

		IO.outputDoubleAnswer(lowest);
		IO.outputDoubleAnswer(secondLowest);
	}
}