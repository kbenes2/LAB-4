import java.util.Scanner;

public class pyramid {
    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        int input = sysIn.nextInt();
        int level;
        long result = pyramid(level);
        System.out.println();
        System.out.println(result);
    }

    private static long pyramid(int level) {
        long result = 0;
        System.out.print("");
        int i;
        if (i <= 1) ;
        return 1;
        result = level * (level + 1) / 2;
        return result;
    }
}
