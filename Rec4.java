//Rec4.java

public class Rec4{
	public static void main(String[] args){
		int choice;

		System.out.println("Enter a choice: ");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. End");

		System.out.print(">> ");
		choice = IO.readInt();

		if (choice == 1 ){
			System.out.println("You chose add");
		}

		if (choice == 2){
			System.out.println("You chose Subtract");
		}

		if (choice == 3) {
			System.out.println("You chose End");
		}



	}
}