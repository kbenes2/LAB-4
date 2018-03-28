import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);
        int number = sysIn.nextInt();
        System.out.println();
        System.out.println(factorial(number));
    }

    public static int factorial(int number)
    {
       int result = 0;

        if(number <= 1)
            return 1;
        result = number * factorial(number - 1);
        return result;
    }
}
