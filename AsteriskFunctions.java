//AsteriskFunctions.java

public class AsteriskFunctions{
	
	public static void hAsterTower(int height){
		
		//prints top half
		for(int i = 1; i <= height; i++){

			for(int x = 1; x <= i; x++){

				System.out.print("*");
			}

			System.out.println();
		}

		height -= 1;

		//prints bottom half
		for(int y = height; y >= 1; y--){

			for(int z = 1; z <= y; z++){

				System.out.print("*");
			}


			System.out.println();
		}
	}
	

	public static void vAsterTower(int height){

		int numAsterisks = 1;

		for(int i = 1; i <= height; i++){
			for(int x = 1; x <= height-i; x++){

				System.out.print(" ");
			}

			for(int y = 1; y <= numAsterisks; y++){

				System.out.print("*");
			}

			numAsterisks += 2;

			System.out.println();

		}
	}
}