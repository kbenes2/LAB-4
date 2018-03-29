import java.util.Scanner;
public class Reverse {
    public static String reverseString(String start)
    {
        int len = start.length();
        char[] array = new char[len];
        for (int j = len-1; j>=0; j--){
            array[j]= start.charAt(len-1-j);}
            String result = new String(array);
        return result;
        }
    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        String start = sysIn.nextLine();
        String reverse = reverseString(start);
        System.out.println(reverse);
    }
}



