import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner sysIn= new Scanner(System.in);
        float fTemp=sysIn.nextFloat();
        float result= fConversion(fTemp);
        System.out.println(result);
    }
    public static float fConversion(float F){
        float Celcius = ((F-32)*5/9);
        return Celcius;
    }

}
