import java.util.ArrayList;

public class Main {
    public static ArrayList<Vehicle>vehicles = new ArrayList<>();

    public static void main(String[] args){

        System.out.println(vehicles);

        Car car = new Car("xyz", "XYZ", 2000, 155, 222);
        System.out.println(car.calculateFuelEfficiency());

        Truck truck = new Truck("xyz1", "XYZ1", 1234, 234, 233, 222);
        System.out.println(truck.calculateFuelEfficiency());

        Truck truck2 = new Truck("xyz2", "XYZ2", 2222, 123, 234, 345);
        System.out.println(truck2.calculateFuelEfficiency());
    }
}