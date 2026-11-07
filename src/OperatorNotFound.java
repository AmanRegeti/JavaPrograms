public class OperatorNotFound extends RuntimeException {
    public OperatorNotFound(String message) {
        super(message);
    }

    public OperatorNotFound(Exception e) {
        super(e);
    }
    public OperatorNotFound(Exception e, String message) {
        super(message, e);
        System.out.println(e);
    }
}
