// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int count=0;
//         int max=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]==1)
//             {
//                 count++;
//                 continue;
//             }
//             else if(count>max)
//             {
//                 max=count;
//                 count=0;
//             }
//         }
//         if(count>max)//this condition for last all elements are 1 like example1 after all 1 lopp will end and it will not check if so we have to cjheck uotside of loop.
//         {
//             max=count;
//         }
//         return max;
        
        
//     }
// }

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;  // To store the maximum count of consecutive 1's
        int currentCount = 0;  // To store the current count of consecutive 1's
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCount++;  // Increment count if the current element is 1
            } else {
                // Check if current streak of 1's is greater than maxCount
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
                currentCount = 0;  // Reset currentCount when a 0 is encountered
            }
        }
        
        // Final check after the loop in case the array ends with consecutive 1's
        if (currentCount > maxCount) {
            maxCount = currentCount;
        }
        
        return maxCount;
    }
}
