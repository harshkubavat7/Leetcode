class Solution {
    public String frequencySort(String s) {
        
        // Step 1: Count frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create a max-heap (PriorityQueue) based on frequency
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
            (a, b) -> freqMap.get(b) - freqMap.get(a)
        );

        maxHeap.addAll(freqMap.keySet());

        // Step 3: Build the result string
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char current = maxHeap.poll();
            int freq = freqMap.get(current);
            for (int i = 0; i < freq; i++) {
                result.append(current);
            }
        }

        return result.toString();
    }
}