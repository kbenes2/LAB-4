import java.util.Scanner;

public class Recursive2 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int Triangle = scan.nextInt(); //this is what we are inputting
        float Final = Ball(Triangle);
        System.out.print(Final);
    }

    public static long Ball(int Triangle) //Ball = Cannonball
    {
        long Final = 0; //we want to start with 0
        int i = Triangle;
        while(i > 0)
        {
            Final = Final + i;
            i--;
        }
        return Final;
    }
}
