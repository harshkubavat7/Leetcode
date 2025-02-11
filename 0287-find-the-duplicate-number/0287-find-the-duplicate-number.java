class Solution {
    public int findDuplicate(int[] nums) {
        int i=0,b;
        
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
                
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[j]!=j+1)
                    {
                        return nums[j];
                    }
                }
                return nums.length; //there is work of this line but we use int in method that's why i //have return something always code not reach till end it return in for loop duplicate value
    }
}