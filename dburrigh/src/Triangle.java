import java.util.Scanner;

public class Triangle {
    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        int Ax = sysIn.nextInt(); //I want to input each x and y separately for each vertex
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
        double LengthAB = Math.sqrt(Math.pow(Bx - Ax,2) + Math.pow(By - Ay,2)); //Math.pow was the only way I knew how to set mathematical expressions to the 2nd power
        return LengthAB;
    }

    private static double SideAC(int Ax, int Ay, int Cx, int Cy)
    {
        double LengthAC = Math.sqrt(Math.pow(Cx - Ax,2) + Math.pow(Cy - Ay,2));
        return LengthAC;
    }

    private static double SideBC(int Bx, int By, int Cx, int Cy)
    {
        double LengthBC = Math.sqrt(Math.pow(Cx - Bx,2) + Math.pow(Cy - By,2));
        return LengthBC;
    }
}