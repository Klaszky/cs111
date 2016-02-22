//Scores.java

public class Scores{
	
	public static void main(String[] args){

		int judges, counter = -2;
		double input, average;
		double total = 0, hiScore = -1.0, lowScore = 10.1;

		System.out.println("java Scores");

		System.out.print("\nEnter the number of judges: ");
		judges = IO.readInt();

		while(judges <= 0){
			System.out.println("I didn't understand that.");
			System.out.print("Enter the number of judges: ");
			judges = IO.readInt();
		}

		for(int i = 0; i < judges; i++){
			System.out.print("Enter score: ");
			input = IO.readDouble();

			while(input < 0.0 || input > 10.0){
				System.out.println("That isn't a valid score.");
				System.out.print("Enter score: ");
				input = IO.readDouble();
			}

			if(input < lowScore){
				lowScore = input;
			}

			if(input > hiScore){
				hiScore = input;
			}

			total += input;
			counter++;

		}

		total -= hiScore;
		total -= lowScore;

		average = total/counter;

		IO.outputDoubleAnswer(average);

	}
}