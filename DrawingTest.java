//Drawing.java

public class DrawingTest{

	public static void main(String[] args){
		
		int right, down, diameter;

		System.out.println("Enter how far to the right to move.");

		right = IO.readInt();

		System.out.println("Enter how far down to move.");		
		
		down = IO.readInt();

		System.out.println("Enter the diameter of the circle:");
		
		diameter = IO.readInt();

		Picasso.moveRight( right );
		Picasso.moveDown( down );
		Picasso.drawCircle( diameter );

	}
}