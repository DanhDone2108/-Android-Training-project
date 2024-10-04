public class Polymorphism {
    public void SoudnAnimal(){
        System.out.println("Sound Anmial");
    }
    static class Dog extends Polymorphism{
        @Override
        public void SoudnAnimal(){
            System.out.println("Sound Dog: Woof Woof! ");
        }
    }
    static class Cat extends Polymorphism{
        @Override
        public void SoudnAnimal(){
            System.out.println("Sound Cat: Meoo Meoo! ");
        }
    }
    public static void main(String[] args) {
        Polymorphism myAnimal = new Polymorphism();
        Polymorphism myDog = new Dog();
        Polymorphism myCat = new Cat();
        myAnimal.SoudnAnimal();
        myDog.SoudnAnimal();
        myCat.SoudnAnimal();
    }

}
