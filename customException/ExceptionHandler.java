package customException;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandler {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older.");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
