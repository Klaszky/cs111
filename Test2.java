//Test2.java
public class Test2{
	public static void main(String[] args){
		int num;
		num = IO.readInt();

		System.out.println("\n");

		for (int i = 1 ; i <= num ; i++){
			for(int count=1 ; count <= num ; count++){
				if(count <= i){
					System.out.print(i*count+" ");
				}else{
					continue;
				}
			}
			System.out.println();
		}

	}
}