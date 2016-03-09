//test.java
//just used as a client to test functions and whatnot
public class test{

	public static void main(String[] args){

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
		
	}

}
