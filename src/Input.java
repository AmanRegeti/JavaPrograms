import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;
//synchronization is bad because it takes more time to finish a request and then do another request. synchronization is bad because it if we were counting and we had 2 operators at the same time we wouldn't know how many.
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
