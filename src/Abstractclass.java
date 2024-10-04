abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Circle is drawing.");
    }
}
public class Abstractclass {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.draw();

    }
}
