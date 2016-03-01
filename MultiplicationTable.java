//MultiplicationTable.java

public class MultiplicationTable{

	public static void printTable(int num){

		for(int i = 1; i <= num; i++){

			for(int x = 1; x <= num; x++){
				System.out.printf("%4d", i*x);
			}
			System.out.println();
		}

	}

}
