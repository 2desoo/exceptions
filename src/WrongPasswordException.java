public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException() {
        super("The password does not match the parameters.");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}