import java.util.Scanner;
import java.lang.String;

public class Recursive1 {

    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        int Integer = sysIn.nextInt();
        String result = Factorial(Integer);
        System.out.print(result);
    }

    private static String Factorial(int Integer)
    {
        String result ="" + Integer;
        for (int i = Integer; i > 1; i--)
        {
            int nextInteger = i - 1;
            result = result + "*" + nextInteger;
        }
        return result;
    }
}