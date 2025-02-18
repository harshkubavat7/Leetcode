class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(n<3) return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>(); //in hashset all records are unique and in     question they tell don't store duplicate.
        for(int i=0;i<n-2;i++)//n-2 b/c we want atleast 3 element for sum after n-3 there is only 2 element remain        
        {
            int start=i+1;
            int end=n-1;
            while(start<end)
            {
                int sum=nums[i]+nums[start]+nums[end];
                if(sum==0)
                {
                    result.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    start++;
                    end--;
                }
                else if(sum<0)
                {
                    start++;
                }
                else{
                    end--;
                }
            }

        }
        return new ArrayList<>(result);
    }
}