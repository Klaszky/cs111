//TwoSmallest.java

public class TwoSmallest{
	
	public static void main(String[] args){

		int counter = 0;

		//i've initalized lowest and secondlowest to the smallest value an int can hold
		double sentinel, input, lowest = -2147483648, secondLowest = -2147483648;

		//grabs sentinel value to end program
		System.out.print("Enter a number. This that will end the program: ");
		sentinel = IO.readDouble();

		System.out.println("Enter a series of numbers and I'll out the two lowest numbers.");


		do{
			System.out.print(">> ");
			input = IO.readDouble();

			//conditional so I don't acciendtally add the sentinel value
			if(input != sentinel){

				//assigns first value to lowest then checks for second value
				if(counter == 0){
					lowest = input;
				}else if(counter == 1 && input >= lowest){
					secondLowest = input;
				}

				//if there is a new lowest bumps old lowest to second
				if(input < lowest){
					secondLowest = lowest;
					lowest = input;
				}else if(input <= secondLowest){
					secondLowest = input;
				}

				counter++;
			}else if(input == sentinel && counter < 2){
				IO.reportBadInput();
			}

		}while(counter < 2 || input != sentinel);
		

		IO.outputDoubleAnswer(lowest);
		IO.outputDoubleAnswer(secondLowest);
	}
}