
// BEAR--MUFFINS
import java.util.Scanner;
class Extra30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "You enter a dark room with two doors. Want to to go through door #1 or door #2?");

		int door,bear,insanity;
		door = sc.nextInt();

		 if(door == 1){
			 System.out.println( "There's a giant bear here eating a cheese cake. What do you do?");
			 System.out.println( "1. Take the cake.");
			 System.out.println( "2. Scream at the bear.");

			 bear = sc.nextInt();

			 if( bear == 1)
				System.out.println( "Oh! The bear eats your face off. GAME OVER!");
			 else if( bear == 2)
				System.out.println( "Oh! The bear eats your legs off. GAME OVER!");
			 else
				System.out.println( "Well, doing "+ bear+" is probably better. Bear runs away.");
		}
		 else if( door == 2){
			 System.out.println( "Hey, now stare into the eyes of a huge monster. What do you see?");
			 System.out.println( "1. Blueberries.");
			 System.out.println( "2. Muffin.");
			 System.out.println( "3. Revolvers.");

			 insanity = sc.nextInt();

			 if( insanity == 1 || insanity == 3)
			 System.out.println( "Oh! You became insane. GAME OVER!");
			 else
			 System.out.println( "Your body survives powered by a muffin. WINNER!");
		 }
		 else
		 System.out.println( "You stumble around and fall on a knife and die. GAME OVER!");
	}
	// TO WIN: DOOR=1, BEAR=3.  OR DOOR=2, INSANITY=2;
}