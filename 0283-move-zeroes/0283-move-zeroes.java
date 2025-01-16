class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int nonzeroindex=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[nonzeroindex]=nums[i];
                nonzeroindex++;
            }

        }
        while(nonzeroindex<n)
    {
        nums[nonzeroindex]=0;
        nonzeroindex++;
    }
    }
    
}