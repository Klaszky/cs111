//PayFriend.java
public class PayFriend{

	public static void main(String[] args){

		double payment, fee = 0;

		System.out.println("java PayFriend");

		System.out.print("\nEnter payment: ");
		payment = IO.readDouble();

		if(payment >= 10000){

			if(payment > 15000){

				fee += 200;

				payment -= 15000;

				fee += (payment * .03);
			}else if(payment > 10000){

				fee += 100;

				payment -= 10000;

				fee += (payment * .02);
			}else{

				fee += 100;
			}

		}else if(payment >= 1000){
			
			double onePercent = payment * .01;

			if(onePercent >= 15){

				fee = onePercent;
			}else{

				fee = 15;
			}

		}else if(payment > 100){
			
			double threePercent = payment * .03;

			if(threePercent >= 6){
				
				fee = threePercent;
			
			}else{
				fee = 6;
			}

		}else{

			fee = 5;
		}

		IO.outputDoubleAnswer(fee);
	}
}