import java.util.Scanner;

public class Lab4_4 {

    private static int[] OrderedString(String Line)
    {
        int[] a;
        a = new int[Line.length()];
        Scanner scan2 = new Scanner(Line);
        for(int x = 0; x < Line.length(); x++)
        {
            a[x] = scan2.nextInt();
        }
        for(int z = 0; z < Line.length(); z++)
        {
            for (int y = 0; y < Line.length(); y++) {
                if (a[y] > a[y + 1])
                {
                    int b = a[y];
                    int c = a[y + 1];
                    int temp;
                    temp = b;
                    b = c;
                    c = temp;
                    a[y] = b;
                    a[y + 1] = c;
                }
            }
        }
        return a;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String Line = scan.nextLine();
        int[] Answer = OrderedString(Line);
        System.out.println(Answer);
    }
}
