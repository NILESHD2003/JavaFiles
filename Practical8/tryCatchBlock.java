package Practical8;

public class tryCatchBlock {
    public static void main(String[] args) {
        divide div=new divide();
    }
}
class divide{
    divide(){
        int z=10;
        int a=0;
        int sol;

//        sol=z/a;

        try{
            sol=z/a;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("Above Exception handled Successfully");
    }
}
