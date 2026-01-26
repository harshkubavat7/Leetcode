class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize result with -1
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        // Traverse twice to simulate circular array
        for (int i = 2 * n - 1; i >= 0; i--) {
            int current = nums[i % n];

            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            if (i < n) {
                result[i] = stack.isEmpty() ? -1 : stack.peek();
            }

            stack.push(current);
        }

        return result;
    }
}
