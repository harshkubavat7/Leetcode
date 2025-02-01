class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        
                while(i<nums.length)
                {
                    int temp;
                    int correct = nums[i]-1;//correct index ex:- 3 index is 2.
                    if(nums[i]!=nums[correct])//we are starting from 1 not 0 element.
                    {
                       temp=nums[i];
                       nums[i]=nums[correct];
                       nums[correct]=temp;
                       
                    }
                    else{
                        i++;
                    }
                }
                List<Integer> ans = new ArrayList<>();
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[j]!=j+1)
                    {
                        ans.add(j+1);
                    }
                }
                return ans;
    }
}