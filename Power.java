public class Power{
	public static void main(String[] args){
		int output = exp(5, 3);

		System.out.println(output);
	}

	public static int exp(int a, int b){
		int toReturn = 1;

		for(int i = 0; i < b; i++){
			toReturn *= a;
		}

		return toReturn;
	}
}