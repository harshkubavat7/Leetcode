class Solution {
    public int myAtoi(String s) {
        s=s.trim(); // Remove leading and trailing whitespace
        long num=0; // Use long to handle overflow during calculation
        int n = s.length();
        if(s.isEmpty())  // If the string is empty after trimming
        {
            return 0;
        }
        int sign=1;
        int i=0;
        if(s.charAt(i)=='-' || s.charAt(i)=='+')
        {
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
        // Convert the digits to integer
        while(i<n && Character.isDigit(s.charAt(i)))
        {
            num = num*10 + (s.charAt(i)-'0');
            if(num*sign > Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            if(num*sign < Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(num*sign);
    }
}