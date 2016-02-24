//Asterisk.java

public class Asterisk{

	public static void main(String[] args){

		int userInput, userChoice;

		System.out.print("Enter the height of your asterisk tower(min 1): ");
		userInput = IO.readInt();

		//error check
		while(userInput < 1){

			IO.reportBadInput();
			System.out.print("Enter the height of your asterisk tower(min 1): ");
			userInput = IO.readInt();			
		}


		System.out.println("What kind of tower would you like?");
		System.out.print("1.Horizontal\n2.Vertical\n3.Both\n>> ");
		userChoice = IO.readInt();

		while(userChoice < 0 || userChoice > 3){
			IO.reportBadInput();
			System.out.println("What kind of tower would you like?");
			System.out.println("1.Horizontal\n2.Vertical\n3.Both\n>> ");
			userChoice = IO.readInt();
		}

		if(userChoice == 1){
			AsteriskFunctions.hAsterTower(userInput);
		}else if(userChoice == 2){
			AsteriskFunctions.vAsterTower(userInput);
		}else if(userChoice == 3){
			AsteriskFunctions.hAsterTower(userInput);
			AsteriskFunctions.vAsterTower(userInput);
		}
	}
}