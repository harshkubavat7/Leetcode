class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i<nums.length-1 && nums[i]==nums[i+1])
            {
                continue;
            }
            else{
                nums[count]=nums[i];//replace unique in place of duplicate
                count++;
            }
            
        }
        return count;
    }
}