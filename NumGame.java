import java.util.Scanner;
import java.lang.Math;

public class NumGame {
    public static void guessGame() {
        Scanner sc = new Scanner(System.in);
        int randomNumber = 1 + (int) (100 * Math.random());
        int tries = 8, i, ch;
        System.out.println("Guess any Number between 1 to 100 within "+ tries +" tries");

        for (i = 0; i < tries; i++) {
            System.out.println("Enter number");
            ch = sc.nextInt();

            if (randomNumber == ch) {
                System.out.println("Great! You guessed it correctly");
                break;
            } else if (ch > randomNumber && i != tries - 1) {
                System.out.println("The Number Entered is Greater ");
            } else if (ch < randomNumber && i != tries - 1) {
                System.out.println("The Number Entered is Less ");
            }
        }
        if (i == tries) {
            System.out.println("Out of attempts ");
            System.out.println("The correct number is " + randomNumber);

        }
    }
    //main function
    public static void main(String[] arg) {
        guessGame();
    }
}