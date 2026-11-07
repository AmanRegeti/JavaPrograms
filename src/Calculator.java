import java.sql.SQLOutput;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner operatorFinder = new Scanner(System.in);
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = operatorFinder.next().charAt(0);
        if (operator != '+' && operator != '-' && operator != '*'&& operator != '/'){
            System.out.println("Operator Not Found");
            return;
        }
        System.out.println("You selected the operator: " + operator);

//        Scanner numberlength = new Scanner(System.in);
//        System.out.println("How many numbers are you going to " + operator + " : ");
//        int numbercount = numberlength.nextInt();

        Scanner firstNumber = new Scanner(System.in);
        System.out.println("What is the number you want to " + operator + " to:");
        long solution = firstNumber.nextInt();

        solution = math(solution, operator);
        System.out.println("Your final answer is :" + solution);
    }
    private static long math(long solution, char operator) {
        for (int i = 1; ; i++) {
            Scanner NumberFinder = new Scanner(System.in);
            System.out.print("Enter the " + i + " integer: ");
            long Number = NumberFinder.nextInt();
            solution = calculate(operator, solution, Number);
            return solution;
        }
    }
    public static long calculate(char operator, long solution, long number) {

        if (operator == '+') {
            return solution + number;
        } else if (operator == '-') {
            return solution - number;
        } else if (operator == '*') {
            return solution * number;
        } else if (operator == '/') {
            return solution / number;
        }
        return solution;
    }
}
