package Programs;

public class ArrayDuplicateRemove {
    public static void main(String[] args) {

        int[] nums={1,1,2,3};
        Solution4 s4=new Solution4();

        int k=s4.removeDuplicates(nums);

//        System.out.println(k);

    }
}

class Solution4 {
    int removeDuplicates(int[] nums)
    {
        int k=nums.length;

        for(int i=0;i<nums.length;i++)
        {
            int check=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    check=check+1;
                    if(check>1)
                    {
                        nums[j]='_';
                    }
                }
            }
        }

        for(int element:nums)
        {
            if(element==95) k--;
        }

        for(int i=0;i< nums.length;i++)
        {
            for(int j=0;j< nums.length;j++)
            {
                if(nums[j]=='_')
                    nums[j]=nextUnmarked(nums,j);
            }
        }


        for(int element:nums)
        {
            System.out.print(element+" ");
        }

        return k;
    }

    int nextUnmarked(int[] array,int i)
    {

        for(int x=i;x< array.length;x++)
        {
            if(array[x]!='_')
            {
                return array[x];
            }
        }

        return -1;
    }
}
