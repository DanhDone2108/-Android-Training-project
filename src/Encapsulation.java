public class Encapsulation{

    private int age;

    public void SetAge(int newage) {
        this.age = newage;

    }

    public int GetAge() {
        return age;
    }


    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.SetAge(20);
        System.out.println("The Person's age is: "+ obj.GetAge());
    }
}
