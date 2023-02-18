package Programs;

import java.io.*;
import java.util.*;

public class SeriesPrinter {

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();

        for(int x=t;x>0;x--)
        {
            int a=s.nextInt();
            int b=s.nextInt();
            int n=s.nextInt();

            int[] S=new int[n];

            for(int z=0;z<n;z++)
            {
                if(z==0)
                {
                    S[z]=calculate(z,a,b);
                }
                else
                {
                    S[z]=S[z-1]+calculate(z,a,b);
                }
            }

            for(int element:S)
            {
                System.out.println(element+" ");
            }
        }
    }

    static int calculate(int z,int a,int b){
        return a+((int)Math.pow(2,(double) z))*b;
    }
}
