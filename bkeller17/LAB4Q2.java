import java.util.Scanner;

public class LAB4Q2 {
public static double ConvertFtoC(int Input){
        return (Input-32) * 5/9.0;
}
        public static void main(String [] args)
        {
                Scanner scan = new Scanner(System.in);
                int input = scan.nextInt();
                
                int F = input;

                System.out.println(ConvertFtoC(F));

        }
}
