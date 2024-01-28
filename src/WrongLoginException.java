public class WrongLoginException extends RuntimeException{
    public WrongLoginException() {
        super("The login does not match the parameters.");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}