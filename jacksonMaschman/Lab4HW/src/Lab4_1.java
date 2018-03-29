import java.util.Scanner;

public class Lab4_1 {

    private static String ReverseString(String string)
    {
        char[] a;
        a = new char[string.length()];
        String answer = "";

        for(int x = 0; x < string.length(); x++)
        {
            a[x] = string.charAt(x);
        }

        for(int y = (string.length() - 1); y >= 0; y--)
        {
            answer = answer + a[y];
        }

        return answer;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String string2 = scan.nextLine();
        String whatever = ReverseString(string2);
        System.out.println(whatever);
        //Jackson
    }
}
