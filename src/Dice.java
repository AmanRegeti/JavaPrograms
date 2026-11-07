import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int diceNumber = (int) ((Math.random() * 6) + 1);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a guessing number : ");
            int guess = input.nextInt();

            if (guess == diceNumber) {
                System.out.println("Congratulation. You got the right number");
                break;
            } else {
                System.out.println("Wrong");
            }

            if (i == 2) {
                System.out.println("The right number is " + diceNumber + ".");
            }
        }
    }
}