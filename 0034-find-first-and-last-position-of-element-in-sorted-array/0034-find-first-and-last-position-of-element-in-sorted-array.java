class Solution {
    public int[] searchRange(int[] nums, int target) {

        int leftindex = findleft(nums,target);
        int rightindex = findright(nums,target);
        return new int[]{leftindex,rightindex};


        // int first=-1,second=-1;
        // int[] s = new int[2];
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==target)
        //     {
        //         first=i;
        //         break;
        //     }
        // }
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==target)
        //     {
        //         second=i;
                
        //     }
        // }
        // s[0] = first;
        // s[1] = second;

        // return s;


    }
    public int findleft(int[] nums,int target){
        int index=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                index=mid;
                high=mid-1;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return index;
    }
    public int findright(int[] nums,int target){
        int index=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                index=mid;
                low=mid+1;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return index;
    }

}