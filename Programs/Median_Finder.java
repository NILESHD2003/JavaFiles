package Programs;

class Median{
    int[] merger(int []A,int[] B)
    {
        int size=A.length+B.length,i=0;
        int[] C=new int[size];

        for (int element:A)
        {
            C[i]=element;
            i++;
        }
        for (int element:B)
        {
            C[i]=element;
            i++;
        }
//        System.out.println("Values passed to sorter");

        return C;
    }
    int[] sorter(int[] array,int size)
    {
        int temp;
        for(int i=0; i < size; i++){
            for(int j=1; j < (size-i); j++){
                if(array[j-1] > array[j])
                {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }

            }
        }

//        System.out.print("Sorted combined array is ");

//        for (int elements:array)
//        {
//            System.out.print(elements+" ");
//        }

//        System.out.println(" ");
//        System.out.println("Values passed to median");

        return array;
    }
    double median(int[] array,int size)
    {
        int x=size/2,sum;
        double med;

        if (size%2==0)
        {
            sum=array[x-1]+array[x];
            med=sum/2F;
        }
        else
        {
            sum = array[x];
            med=sum;
        }
//        System.out.println("Values pass to main");
        return med;
    }
}
public class Median_Finder {
    public static void main(String[] args)
    {
        int[] nums1={1,2},nums2={3,4};
//        System.out.println("Values passed to merger");
        Median obj=new Median();

        int[] array=obj.merger(nums1,nums2);
        int size=array.length;
        array=obj.sorter(array,size);
        double ans=obj.median(array,size);

        System.out.println(ans);
    }
}