class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int startIndex = s.length()-1;
        while(startIndex>=0){
            while(startIndex>=0 && s.charAt(startIndex)==' ')
        {
            startIndex--;
        }
        //if no word available
        if(startIndex<0)
        {
            break;
        }
        //one whole sentence since last space
        int endIndex = startIndex;
        while(startIndex>=0 && s.charAt(startIndex)!=' ' )
        {
            startIndex--;
        }
        //after getting sentence
        if(res.length()==0)
        {
            res.append(s.substring(startIndex+1,endIndex+1));

        }
        else{
            res.append(" ");
            res.append(s.substring(startIndex+1,endIndex+1));
        }
        
    }
        return res.toString();
    }
        
}