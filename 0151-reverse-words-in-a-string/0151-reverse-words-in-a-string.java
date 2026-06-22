class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].length()>0){
                sb.append(arr[i]);
                sb.append(" ");
            }
        }
        return sb.substring(0,sb.length()-1).toString();
    }
        
}




// //Start from the end of the string to reverse word order.
//         //res will store the final result
//         StringBuilder res = new StringBuilder();
//         int startIndex = s.length()-1;

//         //Skip trailing or extra spaces at the end or between words.
//         while(startIndex>=0){
//             //Move backward until we reach the beginning of the word.
//         while(startIndex>=0 && s.charAt(startIndex)==' ')
//         {
//             startIndex--;
//         }
//         //If all characters are spaces, break the loop.
//         if(startIndex<0)
//         {
//             break;
//         }
//         //one whole sentence since last space
//         //endIndex marks the end of the current word.
//         int endIndex = startIndex;
//         while(startIndex>=0 && s.charAt(startIndex)!=' ' )
//         {
//             startIndex--;
//         }
//         //after getting sentence
//         if(res.length()==0)
//         {
//             res.append(s.substring(startIndex+1,endIndex+1));

//         }
//         else{
//             res.append(" ");
//             res.append(s.substring(startIndex+1,endIndex+1));
//         }
        
//     }
//         return res.toString();