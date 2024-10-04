import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number start : ");
        int n = sc.nextInt();
        long m = sum(n);
        System.out.println("Factorial is:   " + sum(n));

    }
    public static long sum(int n) {
        if (n == 0 || n == 10) {
            return 1;
        }
        else {
            return n * sum(n - 1);
        }
    }
}
