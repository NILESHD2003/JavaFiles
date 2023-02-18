package Programs;

public class fibonacci {
    public static void main(String[] args) {
        int num1=0,num2=1,num3=0,temp;

        System.out.print("Fibonaccci Series is: "+num1+" "+num2+" ");
//        num3=num1+num2;
//        System.out.print(num3+" ");
        do
        {
            num1=num2;
            num2=num3;
            num3=num1+num2;

            System.out.print(num3+" ");
        }while(num3<10);
    }
}
