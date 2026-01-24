import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class tryWithResourcesInputAndOutput {
    public static void main(String[] args) {
        input();
        output();
    }

    private static void output() {
        int i;
        try (FileInputStream input = new FileInputStream("C:\\Users\\mdeep\\OneDrive\\Desktop\\CodingFile.txt");
             FileOutputStream output = new FileOutputStream("C:\\Users\\mdeep\\OneDrive\\Desktop\\CodingFile.txt");) {
            while ((i = input.read()) != -1) {
                output.write(i);
                System.out.println((char) i);
            }
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
    //when you use try with resources you don't need to close the file stream because it closes it automatically
    private static void input() {
        int i;
        try (FileInputStream input = new FileInputStream("C:\\Users\\mdeep\\OneDrive\\Desktop\\CodingFile.txt")) {
            while((i=input.read()) != -1){
                System.out.println((char) i);
            }
        }   catch (IOException e) {
            System.out.println("Error reading file.");

        }
    }
}