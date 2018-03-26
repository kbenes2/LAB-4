import java.util.Scanner;

public class Triangle {
    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        int Ax = sysIn.nextInt();
        int Ay = sysIn.nextInt();
        int Bx = sysIn.nextInt();
        int By = sysIn.nextInt();
        int Cx = sysIn.nextInt();
        int Cy = sysIn.nextInt();
        double resultAB = SideAB(Ax,Ay,Bx,By);
        double resultAC = SideAC(Ax,Ay,Cx,Cy);
        double resultBC = SideBC(Bx,By,Cx,Cy);
        System.out.print("For this Triangle, Side AB = " + resultAB + " Side AC = " + resultAC + " Side BC = " + resultBC);
    }
    private static double SideAB(int Ax, int Ay, int Bx, int By)
    {
        double LengthAB = (Bx - Ax) + (By - Ay);
        if(LengthAB >= 0)
            return Math.sqrt(LengthAB);
        else
            return Math.sqrt((-1)*LengthAB);
    }

    private static double SideAC(int Ax, int Ay, int Cx, int Cy) {
        double LengthAC = (Cx - Ax) + (Cy - Ay);
        if(LengthAC >= 0)
            return Math.sqrt(LengthAC);
        else
            return Math.sqrt((-1)*LengthAC);
    }

    private static double SideBC(int Bx, int By, int Cx, int Cy) {
        double LengthBC = (Cx - Bx) + (Cy - By);
        if(LengthBC >= 0)
            return Math.sqrt(LengthBC);
        else
            return Math.sqrt((-1)*LengthBC);
    }
}