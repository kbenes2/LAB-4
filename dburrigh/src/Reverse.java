import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String result = reverse(input);
        System.out.print(result);
    }

    public static String reverse(String input)
    {
        int Name = input.length(); //Want the code to know how long the String is
        char[] reverse = new char[Name];
        int i = 0;

        while(i < Name)
        {
            reverse[i] = input.charAt(Name-i-1);
            i++; //keep going until all characters have been run through
        }
        String output = new String(reverse);
        return output;
    }
}
