public class CustomException {

    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {

                throw new InvalidAgeException("Exception thrown for invalid age: " + age);
            }
            System.out.println("Valid age: " + age);
        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Final block");
        }

    }
}