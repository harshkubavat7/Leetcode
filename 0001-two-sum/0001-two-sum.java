class Solution {
    public int[] twoSum(int[] nums, int target) {
        //int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int temp=nums[i]+nums[j];
                if(temp==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}