import java.io.*;

public class inputAndOutput {
    public static void main(String[] args) {
        input();
        output();
    }
    private static void input() {
        int i;
        FileInputStream input = null;
        try {
            input = new FileInputStream("C:\\Users\\mdeep\\OneDrive\\Desktop\\CodingFile.txt");
            while ((i = input.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private static void output() {
        int i;
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream("C:\\Users\\mdeep\\OneDrive\\Desktop\\CodingFile.txt");
            output = new FileOutputStream("C:\\Users\\mdeep\\OneDrive\\Documents\\CodingOutput.txt");
            while ((i = input.read()) != -1) {
                output.write(i);
                System.out.println((char) i);
            }
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            try {
                input.close();
                output.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
