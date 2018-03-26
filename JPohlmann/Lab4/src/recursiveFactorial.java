import java.util.Scanner;

public class recursiveFactorial {
    public static void main(String[] args){
        Scanner sysIn = new Scanner(System.in);
        int number = sysIn.nextInt();
        String result = factorial(number);
        System.out.println(result);
    }
    private static String factorial(int number){
        String result= number +":"+number;
        for(int i = number; i>1;i-- ){
            int number2= i-1;
            result +="*"+number2;
        }
        return result;
    }
}
