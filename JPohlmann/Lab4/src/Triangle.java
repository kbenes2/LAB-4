import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        System.out.println("Write Vertices in form 'x y' with one on each line.");
       Scanner sysIn= new Scanner(System.in);
       int vertice1X = sysIn.nextInt();
       int vertice1Y= sysIn.nextInt();
       int vertice2X = sysIn.nextInt();
       int vertice2Y = sysIn.nextInt();
       int vertice3X = sysIn.nextInt();
       int vertice3Y = sysIn.nextInt();
        double result1= sideOne(vertice2X,vertice1X,vertice2Y,vertice1Y);
        double result2= sideTwo(vertice3X,vertice2X,vertice3Y,vertice2Y);
        double result3 = sideThree(vertice3X,vertice1X,vertice3Y,vertice1Y);
        System.out.println("The Side Lengths are " + result1+" "+result2 +" "+result3);
    }
    public static double sideOne(int xf, int xi, int yf, int yi){
        double sideOne = Math.pow((xf-xi),2)+Math.pow((yf-yi),2);


        return Math.sqrt(sideOne);

    }
    public static double sideTwo(int xf, int xi, int yf, int yi){
        double sideTwo = Math.pow((xf-xi),2)+Math.pow((yf-yi),2);
        return Math.sqrt(sideTwo);
    }
    public static double sideThree(int xf, int xi, int yf, int yi){
        double sideThree = Math.pow((xf-xi),2)+Math.pow((yf-yi),2);
        return Math.sqrt(sideThree);
    }
}
