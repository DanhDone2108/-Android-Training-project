public class Method {
    public void MakeSound() {
        System.out.println("MakeSound");
    }

    static class Dog extends Method {
        @Override
        public void MakeSound() {
            System.out.println("Dog make sound: Woof! ");
        }
    }

    public static class MethodOverriding {
        public static void main(String[] args) {
        Dog dog = new Dog();
        dog.MakeSound();
        }
    }
}
