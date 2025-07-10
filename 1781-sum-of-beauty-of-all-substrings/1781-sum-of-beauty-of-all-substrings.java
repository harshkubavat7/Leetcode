class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int[] freq = new int[26];
            for(int j=i;j<s.length();j++)
            {
                freq[s.charAt(j)-'a']++;
                int beauty = getMaxCount(freq)-getMinCount(freq);
                sum=sum+beauty;
            }

        }
        return sum;
    }
    public int getMaxCount(int[] freq){
        int maxCount=0; //greater than zero will
        for(int i=0;i<26;i++)
        {
            maxCount=Math.max(maxCount,freq[i]);
        }
        return maxCount;
    }

    public int getMinCount(int[] freq){
        int minCount=Integer.MAX_VALUE; //if we take 0 then it will give zero as min value always.
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0){
                minCount=Math.min(minCount,freq[i]);
            }
        }
        return minCount;
    }
}