class Solution {
    private static final int mod = 1000000007;
    public int countGoodNumbers(long n) {
        long evencount = (n+1)/2;
        long oddcount = n/2;

        long part1 = pow(5,evencount);
        long part2 = pow(4,oddcount);


        return (int) ((part1 * part2) % mod);
    }

    public static long pow(long base,long exponent)
    {
        long result=1;
        base = base%mod;
        while(exponent>0)
        {
            if(exponent%2==1)
            {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent/=2;
        }

        return result;

    }
}