import java.util.Scanner;
public class Triangle_Length {
    private static double computeSides1(double x1, double y1, double x2, double y2){
        double s1 = x1-x2;
        double s2 = y1-y2;
        double s11 = Math.pow(s1,2);
        double s22 =Math.pow(s2,2);
        double side_1 = Math.sqrt(s11+s22);
        return side_1;
    }
    private static double computeSides2(double x1, double y1, double x3, double y3){
        double s1 = x1-x3;
        double s3 = y1-y3;
        double s11 = Math.pow(s1,2);
        double s33 =Math.pow(s3,2);
        double side_2 = Math.sqrt(s11+s33);
        return side_2;
    }
    private static double computeSides3(double x2, double y2, double x3, double y3){
        double s3 = x3-x2;
        double s2 = y3-y2;
        double s33 = Math.pow(s3,2);
        double s22 =Math.pow(s2,2);
        double side_3 = Math.sqrt(s33+s22);
        return side_3;
    }
    public static void main(String[] args){
        Scanner sysIn = new Scanner(System.in);
        System.out.println("Input the x value for first point");

        double x1 = sysIn.nextDouble();
        System.out.println("Input the y value for first point");

        double y1 = sysIn.nextDouble();
        System.out.println("Input the x value for second point");

        double x2 = sysIn.nextDouble();
        System.out.println("Input the y value for second point");

        double y2 = sysIn.nextDouble();
        System.out.println("Input the x value for third point");

        double x3 = sysIn.nextDouble();
        System.out.println("Input the y value for third point");

        double y3 = sysIn.nextDouble();

        double sideOne =computeSides1(x1,y1,x2,y2);
        double sideTwo =computeSides2(x1,y1,x3,y3);
        double sideThree =computeSides3(x3,y3,x2,y2);

        System.out.println("The length of the sides of the triangle are "+sideOne+", "+sideTwo+ ", and "+sideThree);
    }
}

