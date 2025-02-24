class Solution {
    public void rotate(int[] nums, int k) {
        //i have use reversing approch
        //first we reverse array
        //then first k element reverse
        //then after k element reverse
        k=k % nums.length;//if k greater than arraylength.
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
        
    }
    private void reverse(int[] nums,int start,int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
           
        }
    }


}