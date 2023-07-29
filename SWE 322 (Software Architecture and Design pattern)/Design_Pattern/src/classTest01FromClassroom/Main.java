package classTest01FromClassroom;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new Bike(5) ;// Create a Bike object with 5 gears
        vehicle.setSpeed(70); // No exception is thrown here, speed is set to 70 km/h
    }
}
