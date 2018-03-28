import java.util.Scanner;
public class Recursion {


    public static int factorial(int x)
    {
        if(x==1) return 1;
        return x * factorial(x-1);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = factorial(x);
        System.out.println(y);
    }
}
