class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int current_profit=0;
        int max_profit=0;
        int buy=arr[0];
        if(n<=1) return 0;
        for(int i=1;i<n;i++)
        {
            if(buy>arr[i])
            {
                buy=arr[i];
            }
            else{
                current_profit=arr[i]-buy;
                max_profit=Math.max(current_profit,max_profit);
            }
        }   
        return max_profit;     
    }
}