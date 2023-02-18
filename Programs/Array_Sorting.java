package Programs;

class Order{
    static void print(int[] array,int size)
    {
        //function to print the array
        for (int elements:array)
        {
            System.out.print(elements+" ");
        }
    }

    static void ascending(int[] array,int size)
    {
        //sorting array
        for (int i=0;i<size-1;i++)
        {
            for (int j=0;j<size-1;j++)
            {
                if(array[j+1]<array[j])
                {
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        //calling print function to print array
        print(array,size);
    }

    static void descending(int [] array,int size)
    {
        //sorting array
        for (int i=0;i<size-1;i++)
        {
            for (int j=0;j<size-1;j++)
            {
                if(array[j+1]>array[j])
                {
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        //calling print function to print array
        print(array,size);
    }
}
public class Array_Sorting {
    public static void main(String[] args) {

        //example array...
        int [] a={100,50,70,80,20,30,90,10,40,60};
        int val=a.length;

        System.out.print("Array before sorting is:");
        Order.print(a,val);
        System.out.println(".");

        System.out.print("Array in Ascending order is:");
        Order.ascending(a,val);
        System.out.println(".");

        System.out.print("Array in Descending order is:");
        Order.descending(a,val);
        System.out.println(".");

    }
}