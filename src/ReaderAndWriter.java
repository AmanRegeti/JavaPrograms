import java.io.*;

public class ReaderAndWriter {

    public static void main(String[] args) {
        Writer();
        Reader();
    }
    private static void Writer(){
        String data = "Hello, Java Readers and Writers!";

        try (Writer writer = new FileWriter("C:\\Users\\mdeep\\Downloads\\output.txt")) { //
            writer.write(data);
            System.out.println("Data successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void Reader(){
        try (Reader reader = new FileReader("C:\\Users\\mdeep\\Downloads\\output.txt")) { //
            int character;
            while((character= reader.read())!=-1){
                System.out.println((char) character);
            }
            System.out.println("Finished reading the File");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
