import java.util.Scanner;

public class reverse
{
    private static String ReverseString(String input)
    {
        int number = input.length();
        String reverse = "";
        for (int i = number - 1; i >= 0; i--)
            reverse = reverse + input.charAt(i);
        return reverse;
    }

    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        String input, reverse = "";
        System.out.println("Reverse input:");
        input = sysIn.nextLine();
        reverse=ReverseString(input);
        System.out.println(reverse);
    }
}
