// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("Car started.");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("Bicycle started.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 2: Polymorphic References
        Vehicle vehicle1 = new Car("Toyota", 2023);
        Vehicle vehicle2 = new Motorcycle("Harley-Davidson", 2023);
        Vehicle vehicle3 = new Vehicle("Generic Vehicle", 2023);

        vehicle1.start();
        vehicle2.start();
        vehicle3.start();

        // Task 3: Creating an Array of Vehicles
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("Toyota", 2023);
        vehicles[1] = new Motorcycle("Harley-Davidson", 2023);
        vehicles[2] = new Vehicle("Generic Vehicle", 2023);
        vehicles[3] = new Bicycle("Schwinn", 2023);

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }

        // Task 4: Using Polymorphism with Method Parameters
        printVehicleInfo(new Car("Toyota", 2023));
        printVehicleInfo(new Motorcycle("Harley-Davidson", 2023));
        printVehicleInfo(new Vehicle("Generic Vehicle", 2023));
    }

    public static void printVehicleInfo(Vehicle vehicle) {
        System.out.println("Brand: " + vehicle.getBrand());
        System.out.println("Year: " + vehicle.getYear());
    }
}