import java.util.Scanner;

public class Recursive1 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int Integer = scan.nextInt();
        String result = Factorial(Integer);
        System.out.print(result);
    }

    private static String Factorial(int Integer)
    {
        String result ="" + Integer; //This is the only way I know how to get this to work
        for (int i = Integer; i > 1; i--)
        {
            int nextInteger = i - 1;
            result = result + "*" + nextInteger;
        }
        return result;
    }
}