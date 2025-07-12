import java.util.Scanner;

public class BagBallUI {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Bag bg = new Bag();
        
        BB basket_ball = new BB();
        Tennis tennis_ball = new Tennis();

        boolean flag = true;
        do{
            System.out.println("Main Menu");
            System.out.println("----------------------------");
            System.out.println("1. Add Ball\n2. Remove Ball\n3. Check Bag\n4. Show Game\n5. Exit");
            System.out.print("Enter your choice : ");
            int input = sc.nextInt();

            switch (input) {
                case 1:{
                    bg.addBall(basket_ball);
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    flag=false;
                    break;
                }
            }
        }
        while(flag);




        
        sc.close();
    }
    
}
