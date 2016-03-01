//MathFunctions.java

public class MathFunctions{

	public static int GCF(int num1, int num2){

		if(num1>num2){
			for(int i = num2; num2 >= 2; i--){
				if(num1 % i == 0 && num2 % i == 0){
					return i;
				}
			}
			return -1;
		}else{
			for(int i = num1; num1 >= 2; i--){
				if(num1 % i == 0 && num2 % i == 0){
					return i;
				}
			}
			return -1;
		}
	}

	public static void simplifyFaction(int numerator, int denom){

		int gcf = GCF(numerator, denom);

		System.out.printf("%d/%d",(numerator/gcf),(denom/gcf));
		System.out.println();
	}

}
