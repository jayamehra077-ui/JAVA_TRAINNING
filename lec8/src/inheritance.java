public class inheritance {// Parent class
    public static void main(String[] args) {
        Car c = new Car();
        c.fuel();
        c.drive();

        Bike b = new Bike();
        b.fuel();
        b.ride();

        Truck t = new Truck();
        t.fuel();
        t.transport();
    }
}
    class Vehicle {
        void fuel() {
            System.out.println("Vehicle uses fuel");
        }
    }

    // Child class 1
    class Car extends Vehicle {
        void drive() {
            System.out.println("Car is driving");
        }
    }

    // Child class 2
    class Bike extends Vehicle {
        void ride() {
            System.out.println("Bike is riding");
        }
    }

    // Child class 3
    class Truck extends Vehicle {
        void transport() {
            System.out.println("Truck is transporting goods");
        }
    }

