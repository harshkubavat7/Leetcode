class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }

    public int mergeSort(int[] nums,int left,int right){
        int count=0;
        if(left>=right) return count;

        int mid = (left+right)/2;
        count+=mergeSort(nums,left,mid);
        count+=mergeSort(nums,mid+1,right);
        count+=countpairs(nums,left,mid,right);
        merge(nums,left,mid,right);
        return count;

    }
    public int countpairs(int[] nums,int low,int mid,int high)
    {
        int right=mid+1;
        int count=0;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long)nums[i]>2L*nums[right])  right++;
            count+=(right-(mid+1));
        }
        return count;
    }

    void merge(int[] nums,int left,int mid,int right)
    {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        
        while (i <= mid) temp[k++] = nums[i++];
        while (j <= right) temp[k++] = nums[j++];
        
        System.arraycopy(temp, 0, nums, left, temp.length);
    }
}