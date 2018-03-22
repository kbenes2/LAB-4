import java.util.Scanner;

public class Temperature {

    private static double F(int F)
    {
        double C = (F - 32)*(5/9);
        return C;
    }

    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        int F = sysIn.nextInt();
        double result = F(F);


        System.out.println(result);
    }
}