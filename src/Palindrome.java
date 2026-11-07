import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a String : ");
            String str = input.nextLine();

            if (str.equals("exit")) {
                System.out.println("Bye!");
                break;
            }

            String reversed = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }

            System.out.println("Reversed String is " + reversed);

            if (str.equals(reversed)) {
                System.out.println("The Given String is a Palindrome");
            } else {
                System.out.println("The Given String is not a Palindrome");
            }
        }
    }
}