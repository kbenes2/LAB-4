import java.util.Scanner;

public class Sorting {

    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        String List = sysIn.next();
        String result = Sort(List);
        System.out.print(result);
       // System.out.print(Sort([1, 2, -2, -4, 0, -1]);
    }

    private static String Sort(String List)
    {
        int commandline = List.length();
        for(int i = 0; i <= commandline; i++)
        {
           if(List[i] < List[i+1])

        }


    }

    private static int SmallestValue(int[] input)
    {
        for(int i = 0; i <= input.length; i++)
        {
            if(input[i]<input[i + 1])
                System.out.print(input[i]);
            else
                System.out.print(input[i + 1]);
        }
    }
}