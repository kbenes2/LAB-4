import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String number = read.nextLine();
        String reverse = "";

        for(int i = number.length()-1; i >=0; i++)
        {
            reverse = reverse + number.charAt(i);
        }
            System.out.print(palindrome(number));
    }
}
