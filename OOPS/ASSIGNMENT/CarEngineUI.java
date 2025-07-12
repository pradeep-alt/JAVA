package ASSIGNMENT;

public class CarEngineUI {

    public static void main(String[] args) {
        Car car1 = new Car();
        Engine engine1 = new Engine(1000);

        
        car1.drive();
        car1.addEngine(engine1);
        try {
            car1.detailsOfCar();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        car1.drive();
    }
    
}
