import java.util.Scanner;

public class invalidinputexception extends Exception {
    public invalidinputexception(String message) {
        super(message); // Gọi constructor của lớp cha
    }


    public static class InputException {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter an integer: ");
                int num = Integer.parseInt(sc.nextLine());
                System.out.println("You enter: " + num);
            } catch (NumberFormatException e) {
                System.out.println("You entered invalid number");
            }
        }
    }
}