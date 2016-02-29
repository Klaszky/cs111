//WhileLoopTest.java

public class WhileLoopTest{

	public static void main(String[] args){

		// int input, sum = 0, counter = 0;

		// System.out.println("Enter a numbers one at a time to be averaged.");
		// System.out.println("Enter a negitive number to end input.");

		// do{
		// 	System.out.print(">> ");
		// 	input = IO.readInt();

		// 	if (input >= 0){
		// 		sum += input;
		// 		counter ++;
		// 	}


		// }while(input >= 0);
	
		// if(counter > 0){
		// 	System.out.println("\nYour avgerage is: " + (double)sum/counter);
		// }else{
		// 	System.out.println("\nNothing to average.");
		// }

		int userinput, counter = 1;

		do{
			System.out.print("Enter an integer that is 1 or greater: ");
			userinput = IO.readInt();
		}while(userinput < 1);

		// while(counter <= userinput){
		// 	System.out.printf("%d ", counter);
		// 	counter ++;
		// }

		for(int i = 1; i <= userinput; i++){
			for(int x = 1; x <= userinput; x++){
				System.out.printf("%3d ", i*x);
			}
			System.out.println();
		}

		System.out.println();
	}
}
