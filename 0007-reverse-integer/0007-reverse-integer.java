class Solution {
    public int reverse(int x) {
        boolean isnegative=false;
        if(x<0)
        {
            isnegative=true;
            x=-x;
        }
        int sum=0;
        while(x>0)
        {
            int last=x%10;
            // Check for overflow before multiplying by 10
            if (sum > Integer.MAX_VALUE / 10 || sum<Integer.MIN_VALUE/10) {
                return 0;  // Overflow detected, return 0 as per problem statement
            }
            sum=sum*10+last;
            x=x/10;
        }
        if(isnegative)
        {
            return -sum;
        }
        return sum;
    }
}