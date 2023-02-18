package Programs;
public class code1011 {
    public static void main(String[] args)
    {
        int[] weights= {1,2,3,4,5,6,7,8,9,10};
        int reqdays=5;
        int res=shipWithinDays(weights, reqdays);
        System.out.println("Capacity is "+res);
    }
    static int shipWithinDays(int[] weights, int days)
    {
        int start=0,end=0,mid=0;

        //calculating min cap and total weight
        for(int i=0;i<weights.length;i++)
        {
            if(start<weights[i])
            {
                start=weights[i];
            }
            end=end+weights[i];
        }

        System.out.println("start"+start);
        System.out.println("end"+end);

        //passing cap as argument

//        while(start<=end)
//        {
//            mid=(start+end)/2;
//
//            System.out.println("Capacity is :"+mid);
//            int x=reqDays(weights, mid, days);
//
//            if(x==days)
//            {
//                return mid;
//            }
//            else if(x<days)
//            {
//                end=mid;
//            }
//            else
//            {
//                start=mid;
//            }
//        }
        int x=reqDays(weights,15,0);
        System.out.println(x);

        if(x==days)
        {
            return 15;
        }
        return -1;
    }
    static int reqDays(int[] weights,int cap,int req_days)
    {
        int day=1,temp_cap=cap;

        for(int i=0;i<weights.length;i++)
        {
            if(weights[i]>temp_cap)
            {
                day++;
                temp_cap=cap;
            }
            else
            {
                temp_cap=temp_cap-weights[i];
            }
        }
        System.out.println(day);
        return day;
    }
}

