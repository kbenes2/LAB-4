import java.util.Scanner;
public class FtoC {
    public static double FahrenheitToC(double Fahr)
    {
        return (Fahr-32)*(5/9);
    }
    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        double Fahr = sysIn.nextInt();
        double Cels = FahrenheitToC(Fahr);
        System.out.println(Cels);
    }}