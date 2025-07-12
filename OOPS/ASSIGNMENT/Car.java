package ASSIGNMENT;

public class Car {
    private Engine engine;

    public Car(){}

    public void drive(){
        if(engine==null){
            System.out.println("Engine not present");
        }
        else{
            System.out.println("Car ready to drive");
        }
    }

    public void addEngine(Engine e){
        if(engine==null){
            engine=e;
            System.out.println(engine.getCc()+" cc Engine added sucessfully...");
        }
        else{
            System.out.println("Engine already exixts...");
        }
    }

    


    try {

        public void detailsOfCar(){
    
        System.out.println("Engine : "+engine.getCc()+" cc");
    
    }
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
}
