import java.util.Scanner;
public class factorial {
    private static long facTorial(int number){
       // long x=0;
        if(number ==2){
            return 2;
        }
        else if (number==1)
            return 1;


        return facTorial(number-1) * number;




    }
    public static void main(String[] args){
        Scanner sysIn = new Scanner(System.in);
        int number = sysIn.nextInt();
        long facTorialed =facTorial(number);

        System.out.println("Factorial of "+number+" is "+facTorialed);
    }
}
