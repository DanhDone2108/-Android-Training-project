
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number ouput arry (0 -> 2): ");
            int n = sc.nextInt();
            if (n >= 0 && n <= 2) {
                switch (n) {
                    case 0:
                        System.out.println("The is Exit");
                        break;
                    case 1:
                        for (int i = 1; i <= 10; i++) {
                            System.out.println(i);
                        }
                        break;

                    case 2:
                        for (int i = 2; i <= 20; i = i + 2) {
                            System.out.println(i);
                        }
                        break;
                 }
                 break;

            } else {
                System.out.println("Enter the number (0 -> 2) ");
            }
            sc.close();
        }

    }

}
