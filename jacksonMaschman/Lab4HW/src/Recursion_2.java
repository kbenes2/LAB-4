import java.util.Scanner;
public class Recursion_2 {

    public static int pyramid(int x)
    {
        int z = 0;
        if(x == 1) return 1;
        for(int y = x; y > 0 ; y--)
        {
            z += y;
        }
        int a = z;
        return a + pyramid(x-1);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int size = pyramid(x);
        System.out.println("There are " + size + " cannonballs in this pyramid.");
    }
}
