// class Solution {
//     public int longestConsecutive(int[] nums) {

//         if(nums.length == 0) {
//             return 0;
//         }

//         Arrays.sort(nums);

//         int count = 1;
//         int longest = 1;

//         for(int i = 1; i < nums.length; i++) {

//             if(nums[i] == nums[i - 1]) {
//                 continue; // ignore duplicates
//             }

//             else if(nums[i] == nums[i - 1] + 1) {
//                 count++;
//             }

//             else {
//                 count = 1;
//             }

//             longest = Math.max(longest, count);
//         }

//         return longest;
//     }
// }

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        int longest =0;
        
        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int count=1;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }

                longest = Math.max(count,longest);



            }
        }

        
        return longest;

    }
}