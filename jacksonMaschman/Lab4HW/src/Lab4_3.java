import java.util.Scanner;

public class Lab4_3 {

    private static String LineLength(String x)
    {
        Scanner scan = new Scanner(x);
        int[] a;
        a = new int[x.length()];
        for(int z = 0; z < x.length(); z++)
        {
            a[z] = scan.nextInt();
        }
        double b = Math.sqrt(Math.pow(a[0]-a[2], 2) + Math.pow(a[1]-a[3], 2));
        double c = Math.sqrt(Math.pow(a[0]-a[4], 2) + Math.pow(a[1]-a[5], 2));
        double d = Math.sqrt(Math.pow(a[2]-a[4], 2) + Math.pow(a[3]-a[5], 2));
        String answer = b + " " + c + " " + d;
        return answer;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        String answer = LineLength(x);
        System.out.println(answer);
    }

}
