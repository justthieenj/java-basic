package exception;

public class CustomException extends Exception {
    public CustomException() {
        super("custom message from CustomException");
    }

    public CustomException(String message) {
        super(message);
    }
}
