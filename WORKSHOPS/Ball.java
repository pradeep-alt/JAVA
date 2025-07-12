public class Ball {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    
}

class BB extends Ball
{
    String game = "Basket Ball";
}

class Tennis extends Ball
{
    String game = "Tennis Ball";
}


class Bag{
    Ball ref;

    public void addBall(Ball ref){
        if(isBagEmpty()){
            this.ref = ref;
            System.out.println("Ball added Sucessfully");
            System.out.println();
        }
        else{
            System.out.println("Ball already added");
            System.out.println();

        }
    }

    public void removeBall(){
        if(isBagEmpty()){
            System.out.println("Ball Already Removed");
        }
        else{
            this.ref=null;
            System.out.println("Ball removed Sucessfully");
        }
    }

    public void showGame(){
        if(ref instanceof BB){
            System.out.println(((BB)ref).game);
        }
        if(ref instanceof Tennis){
            System.out.println(((Tennis)ref).game);
        }
    }

    public boolean isBagEmpty(){
        return ref==null;
    }
}