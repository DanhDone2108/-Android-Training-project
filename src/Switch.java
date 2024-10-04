import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number (1 -> 7): ");
            int num = sc.nextInt();
            if (num >= 0 && num < 7) {
                switch (num) {
                    case 0:
                        System.out.println("Exit");
                        break;
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuseday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                }
                    break;
            } else {
                System.out.println("Your must input number (1 -> 7), try again");
            }
        }
        sc.close();
    }
}
