//test.java
//just used as a client to test functions and whatnot
public class test{

	public static void main(String[] args){

<<<<<<< HEAD
		String text1 = "Hello \nWin \nLose";
		String text2 = "Hello\nWin\nLose";
		String text3 = "Hello\nWin\n";
		String text4 = "Hello\n\n";

		System.out.println(getSecondLine(text1));
		System.out.println(getSecondLine(text2));
		System.out.println(getSecondLine(text3));
		System.out.println(getSecondLine(text4));

//		MultiplicationTable.printTable(5);
//		System.out.println(MathFunctions.GCF(3, 9));
//		System.out.println(MathFunctions.GCF(15, 15));
//		System.out.println(MathFunctions.GCF(8, 12));
//		MathFunctions.simplifyFaction(3, 9);
//		MathFunctions.simplifyFaction(7, 14);
//		MathFunctions.simplifyFaction(14, 2);
//		MathFunctions.simplifyFaction(2, 3928);

		// String doc = "Line1\n\n";

		// doc = doc.split("\n")[1];
		// if(doc.length() == 0)
		// 	System.out.println("shit");
		// else
		// 	System.out.println(doc);

//		String s = "most";
//		String fullName = "Klaszky, Jospeh";
//		String firstName, lastName;

//		if(fullName.indexOf(",") < 0)
//		{
//			firstName = fullName.split(" ")[0];
//			lastName = fullName.split(" ")[1];
//		}
//		else
//		{
//			firstName = fullName.split(",")[1];
//			lastName = fullName.split(",")[0];
//			firstName = firstName.substring(1);
//		}


//		System.out.println(firstName);
//		System.out.println(lastName);
//		System.out.println(s.indexOf("r"));
//		System.out.println(s.indexOf("m"));
//		System.out.println(s.compareTo("zebra"));
//		System.out.println(s.compareTo("apple"));
	}

	public static String getSecondLine(String doc)
	{
		String secondLine = doc.substring(doc.indexOf("\n"));
		return secondLine.substring(0, doc.indexOf("\n"));
		
=======
		// MultiplicationTable.printTable(5);
		// System.out.println(MathFunctions.GCF(3, 9));
		// System.out.println(MathFunctions.GCF(15, 15));
		// System.out.println(MathFunctions.GCF(8, 12));
		System.out.println(MathFunctions.intLen(-23408742));
		// MathFunctions.simplifyFaction(3, 9);
		// MathFunctions.simplifyFaction(7, 14);
		// MathFunctions.simplifyFaction(14, 2);
		// MathFunctions.simplifyFaction(2, 3928);
		// System.out.println(StringMethods.stripNonAlpha("He llo ! joe___"));
		// System.out.println(StringMethods.stripNonAlpha(";alsdjkf104kj;31lk4j1/ @!#13"));
		// System.out.println(StringMethods.stripNonAlpha("2l;3k4 !#$$(*	!#$asdf@#$u8e079845falk;j2"));
		// System.out.println(StringMethods.isAnagram("twin peaks", "A Newt Skip"));
		// System.out.println(StringMethods.isAnagram("To be or not to be: that is the question; whether 'tis nobler in the mind to suffer the slings and arrows of outrageous fortune... ",
		// "In one of the Bard's best-thought-of tragedies our insistent hero, Hamlet, queries on two fronts about how life turns rotten. "));
		// System.out.println(StringMethods.isAnagram("twin peaks", "A Newt Szip"));
		// System.out.println(StringMethods.reverse("Hello"));
		// System.out.println(StringMethods.longestSeq("abaabacccaabbbbazzzzzzzzzbszbnSS"));
>>>>>>> 4e2ae36f3b027d593d9ff182e5706b38c53833fa
	}

}
