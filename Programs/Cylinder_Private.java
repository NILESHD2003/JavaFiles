package Programs;

import java.util.Scanner;

public class Cylinder_Private {
    public static void main(String[] args) {
        cylinder obj=new cylinder();

        obj.setter();
        System.out.println("Surface area of Cylinder is "+obj.getSA());
        System.out.println("Volume of Cylinder is "+obj.getVol());
    }
}
class cylinder{
    private int r,h;
    float pi=3.14159f;
    private float sa,vol;

    private void calculator() {
        sa=(2*pi*r*h)+(2*pi*r*r);
        vol=pi*r*r*h;
    }

    void setter()
    {
        Scanner s=new Scanner(System.in);

        System.out.print("Enter Height:");
        h=s.nextInt();

        System.out.print("Enter Radius:");
        r=s.nextInt();

        calculator();
    }

    float getSA()
    {
        return sa;
    }

    float getVol()
    {
        return vol;
    }
}
