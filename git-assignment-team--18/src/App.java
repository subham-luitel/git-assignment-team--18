// Car class definition
class Car {
    // Public attributes
    public String brand;
    public String model;
    public int amountOfFuel;

    // Parameterless constructor
    public Car() {
        this.brand = "";
        this.model = "";
        this.amountOfFuel = 0;
    }

    // Parameterized constructor
    public Car(String brand, String model, int amountOfFuel) {
        this.brand = brand;
        this.model = model;
        this.amountOfFuel = amountOfFuel;
    }

    // Method to print car data
    public void printData() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Fuel: " + amountOfFuel);
    }

    // Method to change the values of car attributes
    public void changeValues(String newBrand, String newModel, int newFuel) {
        this.brand = newBrand;
        this.model = newModel;
        this.amountOfFuel = newFuel;
    }

    // Method for accelerating
    public void accelerate() {
        if (amountOfFuel > 0) {
            System.out.println("Car is accelerating");
            amountOfFuel--;
        } else {
            System.out.println("No fuel left, can't accelerate!");
        }
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Create car1 using parameterized constructor
        Car car1 = new Car("Fiat", "500", 50);
        car1.printData();  // Print car1 data
        
        // Create car2 using parameterless constructor
        Car car2 = new Car();
        car2.printData();  // Print car2 data (should show default values)
        
        // Change car2 values using the changeValues method
        car2.changeValues("Tesla", "Model 3", 80);
        car2.printData();  // Print car2 data after changing values
        
        // Call the accelerate method on car1
        car1.accelerate();
        car1.printData();  // Print car1 data after acceleration
    }
}