import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        String input = sysIn.next();
        String result = reverse(input);
        System.out.print(result);
    }

    public static String reverse(String input)
    {
        int Name = input.length();
        char[] reverse = new char[Name];
        int i = 0;

        while(i < Name)
        {
            reverse[i] = input.charAt(Name-i-1);
            i++;
        }
        String output = new String(reverse);
        return output;
    }
}
