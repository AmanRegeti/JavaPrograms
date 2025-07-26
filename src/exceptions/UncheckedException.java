package exceptions;

public class UncheckedException extends RuntimeException {
    public UncheckedException(Exception e){
        super (e);
    }
}
