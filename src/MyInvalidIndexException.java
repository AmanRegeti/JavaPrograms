public class MyInvalidIndexException extends RuntimeException{
    public MyInvalidIndexException(String message) {
        super(message);
    }
    /*public MyInvalidIndexException(){

    }*/
    public MyInvalidIndexException(Exception e) {
        super(e);
    }
    public MyInvalidIndexException(Exception e, String message) {
        super(message, e);
        System.out.println(e);
    }
}
