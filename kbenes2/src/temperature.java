import java.util.Scanner;

public class temperature {

    public static double ChangeFtoC(int number)
    {
        return (number-32)*5/9.0;
    }
    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        int input = sysIn.nextInt();
        int F = input;
        System.out.println(ChangeFtoC(F));
    }
}

