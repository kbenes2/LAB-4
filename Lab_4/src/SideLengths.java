import java.util.Scanner;
public class SideLengths {

    public static void main(String[] args)
    {
        System.out.println("Please write in vertices in the form of 'x y' with a space between each point, and with a different point on each line.");
        Scanner grab = new Scanner(System.in);
        double AX = grab.nextInt();
        double AY = grab.nextInt();
        double BX = grab.nextInt();
        double BY = grab.nextInt();
        double CX = grab.nextInt();
        double CY = grab.nextInt();
        double AB = SideLengthAB(AX,AY,BX,BY);
        double BC = SideLengthBC(BX,BY,CX,CY);
        double CA = SideLengthCA(CX,CY,AX,AY);
        System.out.println("Side AB = " + AB);
        System.out.println("Side BC = " + BC);
        System.out.println("Side CA = " + CA);
    }
    public static double SideLengthAB(double AX, double AY,double BX, double BY){
        double sideAB = Math.sqrt(Math.pow((AX-BX),2)+Math.pow((AY-BY),2));
        return (sideAB);}
    public static double SideLengthBC(double BX, double BY,double CX, double CY){
        double sideAB = Math.sqrt(Math.pow((BX-CX),2)+Math.pow((BY-CY),2));
        return (sideAB);}
    public static double SideLengthCA(double CX, double CY,double AX, double AY){
        double sideAB = Math.sqrt(Math.pow((CX-AX),2)+Math.pow((CY-AY),2));
        return (sideAB);}
}
