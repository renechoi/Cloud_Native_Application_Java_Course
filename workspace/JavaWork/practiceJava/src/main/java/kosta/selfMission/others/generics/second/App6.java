package kosta.selfMission.others.generics.second;


import java.util.ArrayList;
import java.util.List;

class Vehicle{
    private int VehicleId;

    public Vehicle(int vehicleId) {
        VehicleId = vehicleId;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    public void info(){
        System.out.println("vehicle id" + getVehicleId());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VehicleId=" + VehicleId +
                '}';
    }
}


class Car extends Vehicle{
    protected String CarModel;


    public Car(int vehicleId, String carModel) {
        super(vehicleId);
        CarModel = carModel;
    }

    public String getCarModel() {
        return CarModel;
    }


    public void info(){
        System.out.println("car model is" + getCarModel());
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarModel='" + CarModel + '\'' +
                '}';
    }
}

public class App6 {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(10));
        list.add(new Vehicle(11));
        list.add(new Vehicle(12));
        list.add(new Vehicle(13));
        list.add(new Car(14,"A14"));
        display(list);
    }

//    public static void display(List<? extends Vehicle> list){ // upper bound
    public static void display(List<? super Car> list){ // lower bound
        for(Object element : list){
            System.out.println(element);
        }
    }


    public static void display2(List<? extends Vehicle> list){ // lower bound
        for(Vehicle element : list){
            element.info();
        }
    }

}
