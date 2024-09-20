import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {

	public static void main(String[] args) {
		int trials = 1;
		int score = 0;
		int points = 0;
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		int randomNumber = random.nextInt(50) + 1;
		while(trials<=5) {
			
			System.out.println("Enter your Guess Between [1-100]:");
			int playerGuess = sc.nextInt();
			trials++;
		
			if(playerGuess == randomNumber) {
				System.out.println("Correct! You Win!!");
				score++;
				System.out.println("It took you "+(trials-1)+" tries.");
				break;
			}
		
			else if(playerGuess > randomNumber) {
				System.out.println("Nope! Your number is higher.Guess Again!");
			}
		
			else {
				System.out.println("Nope! Your number is lower.Guess Again!");
			}
		}
		System.out.println();
		System.out.println("Your score : "+score+" out of "+(trials-1)+".");
		System.out.println();
		System.out.println("Number is : "+randomNumber);
		points = score*(100/(trials-1));
		System.out.println("Points : "+points);
		
		if(sc!=null)
			sc.close();
	}

}

