import java.util.Scanner;

public class ReverseString {
    public static void main(String[]args){
        Scanner sysIn = new Scanner(System.in);
        String stringInput= sysIn.next();
        String result = reverseString(stringInput);
        System.out.println(result);
    }
    public static String reverseString (String stringInput){
       int length= stringInput.length();
       char[] reverse = new char[length];
       for(int i = 0; i < length; i++ ){
           reverse[i]= stringInput.charAt(length-1-i);
       }
       String reverseString1= new String(reverse);
       return reverseString1;

    }
}
