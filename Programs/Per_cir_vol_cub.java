package Programs;

import java.util.Scanner;
class Solution{
    static void p_cir(int x)
    {
        float p=2*x*3.14F;
        System.out.println(p);
    }

    static void vol_cub(int y)
    {
        float c=y*y*y;
        System.out.println(c);
    }
}
class per_cir_vol_cub {
    public static void main(String[] args)
    {
        int a,b;

        Scanner Sc=new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        a=Sc.nextInt();
        System.out.print("Perimeter of circle is: ");
        Solution.p_cir(a);

        System.out.print("Enter Side of cube: ");
        b=Sc.nextInt();
        System.out.print("Volume of cube is ");
        Solution.vol_cub(b);



    }
}
