import java.util.Scanner;
public class Recursion_2 {

    public static int pyramid(int x)
    {
        if(x == 1) return 1;
        int z = 0;
        int a = 0;
        for(int y = x; y > 0 ; y--)
        {
            z = z + (y - a);
            a = a + 1;
        }
        return z + pyramid(x-1);
    }

    public static void main(String[] args)
    {

    }
}
