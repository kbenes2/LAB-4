import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);
        double F = sysIn.nextDouble();
        double result = Convert(F);
        System.out.print(result);
    }

    private static double Convert(double F) {
        double C = (F - 32.0) * (5.0 / 9.0);
        return C;
    }
}