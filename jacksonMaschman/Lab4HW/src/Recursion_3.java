import java.util.Scanner;

public class Recursion_3 {

    private static int palindrome(int y, String x)
    {
        int z = x.length() - y;
        if(z == x.length()) return 0;
        if (x.charAt(z) == x.charAt(y - 1))
        {
            return palindrome(y - 1, x);
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        int y = x.length();
        int z = palindrome(y, x);
        if(z == 1)
        {
            System.out.println("No not a palindrome");
        }
        else
        {
            System.out.println("Yes it is a palindrome");
        }
    }
}
