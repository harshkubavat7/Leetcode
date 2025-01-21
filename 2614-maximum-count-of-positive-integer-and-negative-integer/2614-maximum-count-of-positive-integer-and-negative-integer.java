class Solution {
    public static void main(String[] args)
    {
        int[] nums = {-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(nums));

    }
    static int maximumCount(int[] nums) {
        int pos=0;
        int neg=0;
        for(int i=0;i<nums.length;i++)
        {
           // if(nums[i]==0){
                //continue;
           // }
            if(nums[i]<0)
            {
                neg=neg+1;
            }
            else if(nums[i]>0)
            {
                pos=pos+1;
            }
            else{
                continue;
            }
        }
        if(pos>neg){
            return pos;
        }
        else{
            return neg;
        }
    }
}