package ASSIGNMENT;
public class Engine {
    
    private double cc;

    public Engine(){}

    public Engine(double cc){
        this.cc=cc;
    }

    public double getCc() {
        return cc;
    }


    public void start(){
        System.out.println(cc+" cc Engine started");
    }

}
