//voting.java
public class Voting{
	public static void main(String[] args){
		String name;
		double age;

		System.out.print("What is your name?  - ");
		name = IO.readString();

		System.out.print("What is your age " + name +" - ");
		age = IO.readDouble();

		if (age >= 18){
			System.out.println("You can vote!");
		}else{
			System.out.println("Sorry, you can not vote!");
		}

	}
}