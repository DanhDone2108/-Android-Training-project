public class Exceptionss {
    public static void main(String[] args) {
        try {
            int[] number = {1,2,3};
            System.out.println(number[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught:Array index out of bounds error.");
        }finally {
            System.out.println("Finally block");
        }
    }
}
