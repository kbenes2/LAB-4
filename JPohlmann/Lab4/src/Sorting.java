import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[]args){
        System.out.println("What is your List Size?");
        Scanner sysIn = new Scanner(System.in);
        int listSize = sysIn.nextInt();
        int[] sorter= new int[listSize];
        Scanner inputNum = new Scanner(System.in);
        for(int i=0; i<listSize; i++){
            System.out.println("Enter Number ");
            int num = inputNum.nextInt();
            sorter[i]=num;
        }
        String result=Sorting(sorter);
        System.out.println(result);
        System.out.println("Have a Good Day!");



    }
    private static String Sorting(int[] sorter){
        int[]y;
        Arrays.sort(sorter);
        y=sorter;
        return (Arrays.toString(y));
    }
}
