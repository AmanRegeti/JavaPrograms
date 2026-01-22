import java.io.*;
import java.util.Map;

//Buffering takes the text into memory and does the reading or writing there
public class BufferedReaderAndWriter {
    public static void main(String[] args) {  
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\mdeep\\Downloads\\output.txt"));
             BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\mdeep\\Downloads\\output.txt"))) {
            writer.write("First Line of Text");
            writer.newLine();
            writer.write("Second Line of Text");
            writer.newLine();
            writer.write("Third Line of Text");
            writer.flush();

            String line;
            System.out.println("Reading file Contents");
            System.out.println();
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
