class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
         if(nums.length==1)
            {
                return nums[0];
            }
        for(int i=0;i<nums.length-1;i++)
        {
           
            if(i<nums.length && nums[i]==nums[i+1])
            {
                i++; // Skip the next element as it is part of a pair
            }
            else{
                return nums[i];
            }
        }
        return nums[nums.length-1];
        

    }
}