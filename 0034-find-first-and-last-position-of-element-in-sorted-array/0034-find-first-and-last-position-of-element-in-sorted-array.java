class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1,second=-1;
        int[] s = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                first=i;
                break;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                second=i;
                
            }
        }
        s[0] = first;
        s[1] = second;

        return s;
    }
}