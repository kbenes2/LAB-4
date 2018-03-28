import java.util.Scanner;

public class CannonBall {
    public static void main(String[]args){
        Scanner sysIn= new Scanner(System.in);
        int input = sysIn.nextInt();
        double result=cannonBall(input);
        System.out.println(result);
    }
    private static double cannonBall(int input){
        double result=0;
        for(int i=input; i>0; i--){
            result+=i;
        }
        return result;
    }
}
