import java.util.Scanner;

public class recursive {

    private static long factorial(int number)
    {
        long result = 0;
        System.out.print(number + " ");
        if( number <=1)
            return 1;

        result = number* factorial( number - 1);
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        int number = sysIn.nextInt();
        long result = factorial(number);

        System.out.println( );
        System.out.println( result );
    }
}
