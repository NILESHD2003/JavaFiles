package Programs;
import java.util.Scanner;
class Shapes{
    static void circle(int x)
    {
        float a=3.14F*x*x;
        System.out.println("Area of Circle is "+a);
    }
    static void Triangle(int y,int h)
    {
        float a=0.5F*y*h;
        System.out.println("Area of Triangle is "+a);
    }
    static void rect(int c,int b)
    {
        float a=c*b*1F;
        System.out.println("Area of Rectangle is "+a);
    }
}
class area {
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter the Radius of circle:");
        int r=S.nextInt();
        Shapes.circle(r);

        System.out.print("Enter the Height and Base of Triangle:");
        int h=S.nextInt();
        int b= S.nextInt();
        Shapes.Triangle(h,b);

        System.out.print("Enter the Length and Base of Rectangle : ");
        int l=S.nextInt();
        int b1= S.nextInt();
        Shapes.rect(l,b1);
    }
}
