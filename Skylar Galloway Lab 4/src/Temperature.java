import java.util.Scanner;
public class Temperature {
    private static double converTtemp(char tYpe, double x){
        switch (tYpe){
            case 'C':
                return (x*1.8)+32;
            case 'F':
                return (x-32)*5/9;
        }
        return 0.0;
    }
    public static void main(String[] args){
        System.out.println("Enter the temperature");
        Scanner sysIn = new Scanner(System.in);
        double x = sysIn.nextDouble();
        System.out.println("Enter C if value is in Celsius or F if it is in Fahrenheit ");
        char tYpe = sysIn.next().charAt(0);

        double newTemp = converTtemp(tYpe,x);
        System.out.println("The temperature is"+ " "+newTemp+" "+tYpe);

    }

}
