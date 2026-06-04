class Solution {
    public void sortColors(int[] nums) {
    //     int temp;
    //     boolean swap;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         swap=false;
    //         for(int j=0;j<nums.length-i-1;j++)//after first short largest is at last to reduce step n-1
    //         {
    //             if(nums[j]>nums[j+1])
    //             {
    //                 temp=nums[j];
    //                 nums[j]=nums[j+1];
    //                 nums[j+1]=temp;
    //                 swap=true;
    //             }
    //         }
    //         if(!swap)//if already sorted then arter one loop it breaks
    //         {
    //             break;
    //         }
    // }

    // Arrays.sort(nums);


    int start = 0;
    int mid = 0;
    int end = nums.length-1;

    while(mid<=end){
        if(nums[mid]==0){
            swap(nums,start,mid);
            mid++;
            start++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
            swap(nums,mid,end);
            
            end--;
        }
    }
}

    public static void swap(int[] nums,int num1,int num2){
        int temp;
        temp=nums[num1];
        nums[num1]=nums[num2];
        nums[num2]=temp;
    }
}