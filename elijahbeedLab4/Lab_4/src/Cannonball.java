import java.util.Scanner;
public class Cannonball {
    private static int cannonBall(int integerInput) {
        int numOfBalls = 0;
        int sum = 0;
        for (int j = 0; j <= integerInput; j++) {
            sum = sum + numOfBalls*(numOfBalls+1)/2;
            numOfBalls++;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter number of rows:");
        Scanner sysIn = new Scanner(System.in);
        int numOfRows = sysIn.nextInt();
        int result = cannonBall(numOfRows);
        System.out.println(result);
    }
}
