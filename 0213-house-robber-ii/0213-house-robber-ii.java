class Solution {
    public int rob(int[] nums) {
        if(nums.length<2) return nums[0];

        int[] skipLastHouse = new int[nums.length-1];
        int[] skipFirstHouse = new int[nums.length-1];

        for(int i=0;i<nums.length-1;i++){
            skipLastHouse[i] = nums[i];
            skipFirstHouse[i] = nums[i+1];

       }

       int firstHouse = robber(skipLastHouse);
       int lastHouse = robber(skipFirstHouse);

       int max = Math.max(firstHouse,lastHouse);

       return max;
    }

    static private int robber(int[] arr){
        if(arr.length<2) return arr[0];

        arr[1] = Math.max(arr[0], arr[1]);

        for(int i=2;i<arr.length;i++){
            arr[i]=Math.max(arr[i-2]+arr[i],arr[i-1]);
        }
        return arr[arr.length-1];
        
    }
}