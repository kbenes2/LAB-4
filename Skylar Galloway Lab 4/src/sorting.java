import java.util.Arrays;
import java.util.Scanner;

public class sorting {

    private static String soRt(int [] sortThis) { //This is used to apply the sort function of the array
        int [] x;
         Arrays.sort(sortThis);
         x=sortThis;
         return (Arrays.toString(x));   //This is used to change the array to string

    }
   /* private static String printSort(int[]sortThis){ //This is used to change the array to string
        int[] t= soRt(sortThis);
        return (Arrays.toString(sortThis));
    }
    */
    public static void main(String[] args){
        Scanner num = new Scanner(System.in); //This determines how big the array will be
        System.out.println("Size of list");
        int siZe = num.nextInt();


        int [] sortThis;    //User inputs the number and the number is put into the array which will be passed into soRt and printSort
        sortThis= new int[siZe];
        Scanner userNum = new Scanner(System.in);
        for (int i=0; i<siZe; i++){
            System.out.println("Enter Number  ");
            int number = userNum.nextInt();
            sortThis[i]=number;
        }
        System.out.println(soRt(sortThis));

    }
}

