//Rec5.java
public class Rec5{

	public static void main(String[] args){

		//exercise 1
		int input;
		int totalFor = 0, totalDo = 0, totalWhile = 0;
		int doCounter = 1, whileCounter  = 1;

		System.out.print("Enter an integer and I'll sum all ints from 1 to the number: ");
		input = IO.readInt();

		while(input <= 0){
			IO.reportBadInput();
			System.out.print("Enter an integer and I'll sum all ints from 1 to the number: ");
			input = IO.readInt();
		}

		//as a for loops
		for(int i = 1; i <= input; i++){
			totalFor += i;
		}

		System.out.println(totalFor);

		//as a doWhile loop
		do{
			totalDo += doCounter;
			doCounter++;
		}while(doCounter <= input);

		System.out.println(totalDo);

		//as a while loop
		while(whileCounter <= input){
			totalWhile += whileCounter;
			whileCounter++;
		}

		System.out.println(totalWhile);


		//exercise 2
		// int numOfTest, counter = 1;
		// double scoreInput, avg, total = 0;

		// System.out.print("Enter number of tests: ");
		// numOfTest = IO.readInt();

		// //error check
		// while(numOfTest <= 0){
		// 	IO.reportBadInput();
		// 	System.out.print("Enter number of tests: ");
		// 	numOfTest = IO.readInt();
		// }

		// while(counter <= numOfTest){
			
		// 	System.out.printf("Enter %d test score: ", counter);
		// 	scoreInput = IO.readDouble();

		// 	//error check
		// 	while(scoreInput < 0 || scoreInput > 100){

		// 		IO.reportBadInput();
		// 		System.out.printf("Enter %d test score: ", counter);
		// 		scoreInput = IO.readDouble();
		// 	}

		// 	total += scoreInput;
		// 	counter++;
		// }

		// avg = total/numOfTest;

		// System.out.println(avg);
	}

}