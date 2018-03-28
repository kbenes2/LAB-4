import java.util.Scanner;
public class Factorial {
    private static int intFactorial(int integerInput) {
        int factorial = 1;
        for (int j = 1; j <=integerInput; j++) {
            factorial = j * factorial;
        }
        return factorial;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter number to be factorialized:");
        Scanner sysIn = new Scanner(System.in);
        int integerInput = sysIn.nextInt();
        int result = intFactorial(integerInput);
        System.out.println(result);
    }
}

