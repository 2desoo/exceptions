public class LoginVerification {
    protected static void loginVerification(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
                throw new WrongLoginException();
            }
            if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
                throw new WrongPasswordException();
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Passwords don't match.");
            }
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
