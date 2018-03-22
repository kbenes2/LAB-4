import java.util.Scanner;

public class Reverse_String {
    private static String reVerse(String WoRd){

        int x=WoRd.length();
        String itSflip="";
        char flip[] = new char[x];
        for (int i=0; i<x; i++){
            flip[i] = WoRd.charAt((x-1)-i);
            itSflip = itSflip + flip[i];

        }
        return itSflip;
    }
    public static void main(String[]args)
    {
        Scanner word = new Scanner(System.in);
        System.out.println("Insert Word");
        String WoRd = word.next();
        String result =reVerse(WoRd);

        System.out.println(result);

    }


}
