import java.util.Scanner;
import java.util.Arrays;

public class ArraysBasicUsage {

    public static void printArray1D(String[] array) {

            System.out.println("Output Array is:");
            Arrays.sort(array);
            for (String ar : array) {
                System.out.println(ar);

        }
    }
    public static void printArray2D(String[][] array) {

        System.out.println("Output 2D Array is:");

        for (String[] row : array) {
            System.out.println(Arrays.toString(row));

        }
    }
    //max 2D
    public static int Maxnuber2D(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] row : array) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }

        }
        return max;
    }
// max cua 1D
    public static int Maxnuber1D(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
// nhap duoc ca chu and so
    public static String[] InputArray() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Array size: ");
        int n = sc.nextInt();
        String[] arry = new String[n];
        sc.nextLine();

        while (i < n) {
            System.out.print("Enter number " + (i + 1) + ": ");
            String input = sc.nextLine();
                    arry[i] = input;
                    i++;

        }
        return arry;
    }
    // nhap so
    public static int[] InputArray1D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Array size: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }
    // nhap mang 2D
    public static String[][] IntputArray2D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Array number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Input Array number of columns: ");
        int cols = sc.nextInt();
        String[][] arry2d = new String[rows][cols];
        sc.nextLine();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter number  + ("+ i + ")(" +j +  "): ");
                String input = sc.nextLine();
                arry2d[i][j] = input;
            }
        }
        return arry2d;
    }
    //nhap so 2D
    public static int[][] InputArray2D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Array number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Input Array number of columns: ");
        int cols = sc.nextInt();
        int[][] arry2d = new int[rows][cols];
        sc.nextLine();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter number  + ("+ i + ")(" +j +  "): ");
                arry2d[i][j] = sc.nextInt();
            }
        }
        return arry2d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Input Array 1D ");
        System.out.println("2.Input Array 2D");
        System.out.println("3.Input Array 1D Largest");
        System.out.println("4.Input Array 2D Largest");
        System.out.print("Input number choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                String[] array1D = InputArray();
                printArray1D(array1D);
                break;
            case 2:
                String[][] array2D = IntputArray2D();
                printArray2D(array2D);
                break;
            case 3:
                System.out.println("Input Array 1D to find largest:");
                int[] array1DLargest = InputArray1D();
                int max1D = Maxnuber1D(array1DLargest);
                System.out.println("Largest number in array: " + max1D);
                break;
            case 4:
                System.out.println("Input Array 2D to find largest:");
                int[][] array2DLargest = InputArray2D();
                int max2D = Maxnuber2D(array2DLargest);
                System.out.println("Largest number in 2D array: " + max2D);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 4.");
        }
    }
}
