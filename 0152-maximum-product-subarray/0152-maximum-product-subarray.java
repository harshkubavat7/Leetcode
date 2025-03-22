class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int left=1;
        int right=1;
        int ans = nums[0];
        for(int i=0;i<n;i++)
        {
            //if any left or right becomes 0 then update it by 1.
            left=left==0?1:left;
            right=right==0?1:right;

            left=left*nums[i];
            right=right*nums[n-i-1];

            ans=Math.max(ans,Math.max(left,right));
        }

        return ans;
    }
}