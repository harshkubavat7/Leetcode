class Solution {
    public boolean isPalindrome(String s) {
        //for this solution we convert upperstring to lower string,remove space and alphanumeric.
        // s=s.toLowerCase().replaceAll(regex:"[^A-Za-z0-9]","");
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int start=0;
        int end=s.length()-1;
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        } 
        return true;
    }
}