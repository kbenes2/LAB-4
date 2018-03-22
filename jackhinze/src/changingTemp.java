import java.util.Scanner;


public class changingTemp
{
    public static double changeFtoC(int degreesF)
    {
        return(degreesF-32)*5/9.0;
    }
    public static void main (String []args)
    {
        Scanner scan= new Scanner(System.in);
        int degreesF= scan.nextInt();
        int F= degreesF;
        System.out.println(changeFtoC(F));
    }
}
