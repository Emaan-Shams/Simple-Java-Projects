class Vehicle {
    String vehicleID;
    String brand;
    int speed;
    String fuelType;

    Vehicle(String vehicleID, String brand, int speed, String fuelType) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    void start() {
        System.out.println("Vehicle started.");
    }

    void stop() {
        System.out.println("Vehicle stopped.");
    }

    void displayInfo() {
        System.out.println("ID: " + vehicleID + ", Brand: " + brand + ", Speed: " + speed + " km/h, Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    Car(String vehicleID, String brand, int speed, String fuelType) {
        super(vehicleID, brand, speed, fuelType);
    }

    void openSunroof() {
        System.out.println("Sunroof opened.");
    }

    void activateCruiseControl() {
        System.out.println("Cruise control activated.");
    }
}

class Truck extends Vehicle {
    Truck(String vehicleID, String brand, int speed, String fuelType) {
        super(vehicleID, brand, speed, fuelType);
    }

    void loadCargo(int weight) {
        System.out.println("Cargo loaded: " + weight + " kg");
    }

    void unloadCargo() {
        System.out.println("Cargo unloaded.");
    }
}

class Motorbike extends Vehicle {
    Motorbike(String vehicleID, String brand, int speed, String fuelType) {
        super(vehicleID, brand, speed, fuelType);
    }

    void popWheelie() {
        System.out.println("Popping a wheelie");
    }

    void enableABS() {
        System.out.println("ABS enabled.");
    }
}

class Bus extends Vehicle {
    Bus(String vehicleID, String brand, int speed, String fuelType) {
        super(vehicleID, brand, speed, fuelType);
    }

    void pickPassengers(int num) {
        System.out.println("Picked " + num + " passengers.");
    }

    void dropPassengers() {
        System.out.println("Passengers dropped.");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        Car car = new Car("101", "Honda", 180, "Petrol");
        Truck truck = new Truck("102", "Ferrari", 300, "Diesel");
        Motorbike bike = new Motorbike("103", "Lexus", 150, "Petrol");
        Bus bus = new Bus("104", "Mercedes", 200, "Diesel");

        car.start();
        car.displayInfo();
        car.openSunroof();
        car.activateCruiseControl();
        car.stop();

        truck.start();
        truck.displayInfo();
        truck.loadCargo(2000);
        truck.unloadCargo();
        truck.stop();

        bike.start();
        bike.displayInfo();
        bike.popWheelie();
        bike.enableABS();
        bike.stop();

        bus.start();
        bus.displayInfo();
        bus.pickPassengers(40);
        bus.dropPassengers();
        bus.stop();
    }
}
