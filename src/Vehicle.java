public abstract class Vehicle {
    String make;
    String model;
    int year;
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear() {
        return year;
    }

    public abstract double calculateFuelEfficiency();

}
