import java.util.Scanner;

public class Lab4_2 {

    private static double FtoC(int Temp)
    {
        double Cel = (Temp - 32)*(5/9.0);
        return Cel;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int Temp = scan.nextInt();
        double answer = FtoC(Temp);
        System.out.println(answer);
    }
}
