class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        if(k>nums.length)
        {
            System.out.println("k is larger than array");
            return 0;
        }
        PriorityQueue<Integer> minh = new PriorityQueue<>();

        for(int num : nums){
            minh.add(num);
            if(minh.size()>k)
            {
                minh.remove();
            }
        }
        return minh.peek();
    }
}