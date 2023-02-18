package Concepts;

public class For_Loop {
    public static void main(String[] args)
    {
        int i;

        for(i=0;i<5;i++)
        {
            for(int j=5-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
