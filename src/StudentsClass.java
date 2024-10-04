import javax.xml.namespace.QName;
import java.util.Scanner;
//khai bao thu vien scanner
public class StudentsClass {
    private String name;
    private int age;

    public StudentsClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void display() {
        System.out.println("Name: "+ name + ", Age: "+ age);

    }
    public static void main(String[] args) {
        //ham Scanner dung de nhap
        Scanner sc = new Scanner(System.in);
        //cau truc input
        System.out.println("Enter the name of the student");
        String name = sc.nextLine();
        System.out.println("Enter the age of the student");
        int age = sc.nextInt();
        //Tryen tham so vao class
        StudentsClass student = new StudentsClass("Alice", 20);
        student.display();
        //cau truc output
        System.out.println("Name: "+ name + ", Age: "+ age);



    }
}
