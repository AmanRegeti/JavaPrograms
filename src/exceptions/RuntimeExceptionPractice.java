package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class RuntimeExceptionPractice {
    public static void main(String[] args) {
        runtimeException();
        System.out.println("end");
    }
    private static void runtimeException() throws UncheckedException{
        InputStream is = null;
        try{
            is = new FileInputStream("nonExistentFile.txt");
        }catch (FileNotFoundException e){
            throw new UncheckedException(e);
        }
    }
}
