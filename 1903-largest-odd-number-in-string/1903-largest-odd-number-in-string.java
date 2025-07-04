class Solution {
    public String largestOddNumber(String num) {
        int count = num.length()-1;
        while(count>=0)
        {
            int d=num.charAt(count)-'0';
            if(d%2!=0){
                return num.substring(0,count+1);
            }
            count--;
        }
        return "";
    }
}