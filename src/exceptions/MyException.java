package exceptions;

import java.io.IOException;

public class MyException extends Exception {

    public MyException(Exception e) {
        super(e);
    }
}
