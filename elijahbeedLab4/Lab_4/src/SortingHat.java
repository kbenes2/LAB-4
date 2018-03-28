import java.util.Scanner;
public class SortingHat {
    public static void main(String[] args){
        Scanner hat = new Scanner(System.in);
        System.out.println("Enter your numbers with the first integer being how many integers you want to be sorted, followed by the integers to be sorted. Ex. '6 37 18 19 5 72 98");
        int howMany = hat.nextInt();
        int[] array = new int[howMany];
        for (int j = 0; j <howMany; j++){
            array[j] = hat.nextInt();
        }
        String evensAndodds = arranger(array);
        System.out.println(evensAndodds);
    }

    private static String arranger(int[] array){
        String[] Evens = new String[array.length];
        String[] Odds = new String[array.length];
        int numberOfEvens = 0;
        int numberOfOdds = 0;
        for (int k = 0; k < array.length; k++){
            if (array[k]%2==0){
                Evens[numberOfEvens]=array[k];    /*I'm not sure how to get this to input from one array to another array. It gives me an error of the wrong data type being used where it finds an int instead of a string.*/
                numberOfEvens++;
            }
            else {
                Odds[numberOfOdds]=array[k];
                numberOfOdds++;
            }
        }
        String evensAndodds = ("This is your series of numbers arranged into evens and odds. Evens:" + Evens + ". Odds: " + Odds + ".");
        return (evensAndodds);
    }
}
