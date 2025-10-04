import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
         String name = scanner.nextLine();
        System.out.println(name +" is a nice name");
//        try {
//            input = String.valueOf(System.in.read());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(input);
    }
}
