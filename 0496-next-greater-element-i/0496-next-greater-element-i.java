class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        // we will store next greater element of all values of num2 in Map.
        for(int i=nums2.length -1 ; i>=0;i--){
            int current = nums2[i];

            while(!stack.isEmpty() && current>=stack.peek()){
                stack.pop();
            }

            map.put(current , stack.isEmpty() ? -1 : stack.peek());
            stack.push(current);


        }
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=map.get(nums1[i]);
        }

        return result;
    }
}