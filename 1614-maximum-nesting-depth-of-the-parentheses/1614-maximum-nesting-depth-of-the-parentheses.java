class Solution {
    public int maxDepth(String s) {
        int cur=0,max=0;
        for(char c : s.toCharArray()){
            if(c=='(')
            {
                cur++;
                if(cur>max)
                {
                    max=cur;
                }
            }
            else if(c==')'){
                cur--;
            }
        }
        return max;
    }
}