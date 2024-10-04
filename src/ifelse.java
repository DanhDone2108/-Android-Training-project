import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if (num > 0)
        {
            System.out.println("positive: "+num);
        }
        else if (num < 0)
        {
            System.out.println("Negative: "+num);
        }
        else
        {
            System.out.println("Zero: "+num);
        }
    }
}
