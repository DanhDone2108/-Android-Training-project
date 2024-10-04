public class Inheritance {
     static class Vehicle {
        // attribute
         protected String brand = "Honda";

        //method  to make sound
        public void honk() {

            System.out.println("beep. beep! ");
        }
    }
    static class Car extends Vehicle{
         //Car attribute
        protected String color = "Blue";
        public static void  main(String[] args) {
        //create a myCar object
            Car myCar = new Car();
            myCar.honk();
            System.out.println("Color car: "+ myCar.color + ", Brand car is: " + myCar.brand);
        }
    }
}

