import java.util.Scanner;
public class Cannonball {
    private static int cannonball(int integerInput) {
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
        System.out.println("Enter number of layers:");
        Scanner sysIn = new Scanner(System.in);
        int numOfRows = sysIn.nextInt();
        int result = cannonball(numOfRows);
        System.out.println(result);
    }
}
