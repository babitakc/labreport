class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            checkNumber(0);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkNumber(int num) throws CustomException {
        if (num <= 0) {
            throw new CustomException("Number must be positive.");
        }
    }
}
