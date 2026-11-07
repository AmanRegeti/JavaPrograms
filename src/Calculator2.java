import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner FindEquation = new Scanner(System.in);
        System.out.println("What is you equation: ");
        String Equation = FindEquation.nextLine();
        int e1 = 0;
        long FirstNumber = 0;
        long solution = 0;
        int count = 0;
        for (int i = 0; i < Equation.length(); i++, count++) {
            if (Character.isDigit(Equation.charAt(i))) {
                e1 =  Character.getNumericValue(Equation.charAt(i));               FirstNumber = e1;

            }
            if (count == 1) {
                for (int j = i; j < Equation.length(); j++) {
                    char e2 = Equation.charAt(j);
                    if (e2 == '/' || e2 == '*') {
                       solution = checkOperator(e2, FirstNumber, e1);
                    }
                }
            }
        }
        System.out.println(solution);
    }

    private static long checkOperator(char operator, long FirstNumber, long SecondNumber) {
        long solution = 0;
        if (operator == '+') {
            solution = FirstNumber + SecondNumber;
        } else if (operator == '-') {
            solution = FirstNumber - SecondNumber;
        } else if (operator == '*') {
            solution = FirstNumber * SecondNumber;
        } else if (operator == '/') {
            solution = FirstNumber / SecondNumber;
        }
        return solution;
    }
}
