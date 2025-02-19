class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        //sort the array
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) //i>0 b/c index out of bound in negative
            {
                continue;
            }
            for(int j=i+1;j<n-2;j++)
            {
                if(j>i+1 && nums[j-1]==nums[j])
                {
                    continue;
                }
                int start=j+1;
                int end=n-1;
                while(start<end)
                {
                    long sum=nums[i]+nums[j];
                    sum+=nums[start]+nums[end];
                    if(sum<target)
                    {
                        start++;
                    }
                    else if(sum>target)
                    {
                        end--;
                    }
                    else{
                        ans.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
                        start++;
                        end--;
                        while(start<end && nums[start-1]==nums[start]) start++;
                        while(start<end && nums[end+1]==nums[end]) end--;

                    }
                }
            }
        }
        return ans;
    }
}