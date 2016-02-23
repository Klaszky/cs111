//Scores.java

public class Scores{
	
	public static void main(String[] args){

		int judges, counter = -2;
		double input, average;
		double total = 0, hiScore = -1.0, lowScore = 10.1;

		System.out.println("java Scores");

		//gets number of judges and enforces a min of 3
		System.out.print("\nEnter the number of judges(min 3): ");
		judges = IO.readInt();

		while(judges <= 2){
			IO.reportBadInput();
			System.out.print("Enter the number of judges: ");
			judges = IO.readInt();
		}

		//get scores from each judge
		for(int i = 0; i < judges; i++){
			System.out.print("Enter score: ");
			input = IO.readDouble();

			//makes sure input is between 0 and 10.0
			while(input < 0.0 || input > 10.0){
				IO.reportBadInput();
				System.out.print("Enter score: ");
				input = IO.readDouble();
			}

			//these two conditionals keep track of highest and lowest
			//and are subtracted at the end
			if(input < lowScore){
				lowScore = input;
			}
			if(input > hiScore){
				hiScore = input;
			}


			total += input;
			counter++;

		}

		//for fairness highest and lowest are dropped from average
		total -= hiScore;
		total -= lowScore;

		average = total/counter;

		IO.outputDoubleAnswer(average);

	}
}