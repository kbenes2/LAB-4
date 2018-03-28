import java.util.Scanner;

public class Recursive3 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.print(Palindrome(input));
    }

    private static boolean Palindrome(String input)
    {
        int Name = input.length();
        int count = 0;

        for(int i = 0; i < Name; i++)
        {
            if(input.charAt(i) == input.charAt(Name - i - 1)) //analyze first and last, second and second to last, etc.
            {
                count++;
            }
        }
        return count == Name;
    }
}
