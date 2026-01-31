class StockSpanner {
 
   // Stores indices of days with greater prices
    private Stack<Integer> indexStack;

    // Stores all prices seen so far
    private int[] prices;

    // Keeps track of current day index
    private int day;
    
    public StockSpanner() {
        indexStack = new Stack<>();
        prices = new int[10000]; // max calls as per constraint
        day = 0;
    }
    
    public int next(int price) {
        // Store today's price
        prices[day] = price;

        // Remove indices of smaller or equal prices
        while (!indexStack.isEmpty() &&
               prices[indexStack.peek()] <= price) {
            indexStack.pop();
        }

        int span;
        if (indexStack.isEmpty()) {
            span = day + 1;
        } else {
            span = day - indexStack.peek();
        }

        // Push today's index
        indexStack.push(day);

        // Move to next day
        day++;

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */