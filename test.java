//test.java
//just used as a client to test functions and whatnot
public class test{

	public static void main(String[] args){

		// MultiplicationTable.printTable(5);
		// System.out.println(MathFunctions.GCF(3, 9));
		// System.out.println(MathFunctions.GCF(15, 15));
		// System.out.println(MathFunctions.GCF(8, 12));
		// MathFunctions.simplifyFaction(3, 9);
		// MathFunctions.simplifyFaction(7, 14);
		// MathFunctions.simplifyFaction(14, 2);
		// MathFunctions.simplifyFaction(2, 3928);
		// System.out.println(StringMethods.stripNonAlpha("He llo ! joe___"));
		// System.out.println(StringMethods.stripNonAlpha(";alsdjkf104kj;31lk4j1/ @!#13"));
		System.out.println(StringMethods.isAnagram("twin peaks", "A Newt Skip"));
		System.out.println(StringMethods.isAnagram("To be or not to be: that is the question; whether 'tis nobler in the mind to suffer the slings and arrows of outrageous fortune... ",
		"In one of the Bard's best-thought-of tragedies our insistent hero, Hamlet, queries on two fronts about how life turns rotten. "));
		System.out.println(StringMethods.isAnagram("twin peaks", "A Newt Szip"));
		System.out.println(StringMethods.stripNonAlpha("2l;3k4 !#$$(*	!#$asdf@#$u8e079845falk;j2"));
	}

}
