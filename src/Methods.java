import java.util.Scanner;
public class Methods {
    static int intMethod(int a, int b) {
        return a + b;
    }
    static double sum(double a1, double b1){
        return a1+b1;
    }
    static int intSquare(int a){
        return a*a;
    }


    public static void main(String[] args) {
       //Cho nguoi dùng nhap du lieu
        Scanner sc = new Scanner(System.in);
        System.out.println("Input numbre double a: ");
        double a1 = sc.nextDouble();
        System.out .println("Input numbre double b: ");
        double b1 = sc.nextDouble();
        System.out.println("Square is: " + intSquare(4));
        System.out.println("Sum of double: "+ sum(a1,b1));
        //Du lieu co san
        int c = intMethod(5,3);
        System.out.println("Sum of integers: "+ c);
    }
}

