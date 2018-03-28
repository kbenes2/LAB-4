import java.util.Scanner;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Amount; //number of integers
        int List[] = new int[Amount];

        for (int i = 0; i < Amount; i++)
        {
            Amount = scan.nextInt();
            List[i] = scan.nextInt();
        }
        int i = 0;
        while (i < Amount) {
            System.out.print(List[i] + ",");
            i++;
        }
        System.out.print(List[Amount - 1]);
    }

    public static String AscendingOrder(List[] Amount) //I could not get this to work I tried for a while
    {
        List[]order;
        List.sort(Amount);
        order = Amount;
        return (List.toString(order));
    }
}