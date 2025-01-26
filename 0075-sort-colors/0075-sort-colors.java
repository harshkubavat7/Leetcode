class Solution {
    public void sortColors(int[] nums) {
        int temp;
        boolean swap;
        for(int i=0;i<nums.length;i++)
        {
            swap=false;
            for(int j=0;j<nums.length-i-1;j++)//after first short largest is at last to reduce step n-1
            {
                if(nums[j]>nums[j+1])
                {
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap)//if already sorted then arter one loop it breaks
            {
                break;
            }
    }
}}