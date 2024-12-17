
class Car {
    // Public attributes
    public String brand;
    public String model;
    public int amountOfFuel;

    public Car() {
        this.brand = "";
        this.model = "";
        this.amountOfFuel = 0;
    }

    public Car(String brand, String model, int amountOfFuel) {
        this.brand = brand;
        this.model = model;
        this.amountOfFuel = amountOfFuel;
    }

    public void printData() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Fuel: " + amountOfFuel);
    }

    public void changeValues(String newBrand, String newModel, int newFuel) {
        this.brand = newBrand;
        this.model = newModel;
        this.amountOfFuel = newFuel;
    }

    public void accelerate() {
        if (amountOfFuel > 0) {
            System.out.println("Car is accelerating");
            amountOfFuel--;
        } else {
            System.out.println("No fuel left, can't accelerate!");
        }
    }

    public static void main(String[] args) {

        Car car1 = new Car("Fiat", "500", 60);
        car1.printData(); 
        
        Car car2 = new Car();
        car2.printData(); 
        
        car2.changeValues("Tesla", "Model 3", 80);
        car2.printData(); 
        
        car1.accelerate();
        car1.printData(); 

         // Adding a new car "Toyota"
         Car car3 = new Car("Toyota", "Corolla", 50);
         car3.printData(); 
     }
 }
    

