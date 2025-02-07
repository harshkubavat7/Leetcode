// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int point=1;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]<0 && point<nums.length)
//             {
//                 int temp=nums[point];
//                 nums[point]=nums[i];
//                 nums[i]=temp;
//                 point=point+2;
//             }
//         }

//         return nums;
//     }
// }


class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIndex = 0; // to place positive numbers
        int negIndex = 1; // to place negative numbers
        
        // Traverse through the nums array
        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2; // move to the next position for positivenumbers
            } else {
                result[negIndex] = num;
                negIndex += 2; // move to the next position for negative numbers
            }
        }
        
        return result;
    }
}

