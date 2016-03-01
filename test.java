//test.java
//just used as a client to test functions and whatnot
public class test{

	public static void main(String[] args){

		MultiplicationTable.printTable(5);
		System.out.println(MathFunctions.GCF(3, 9));
		System.out.println(MathFunctions.GCF(15, 15));
		System.out.println(MathFunctions.GCF(8, 12));
		MathFunctions.simplifyFaction(3, 9);
		MathFunctions.simplifyFaction(7, 14);
		MathFunctions.simplifyFaction(14, 2);
		MathFunctions.simplifyFaction(2, 3928);
	}

}
