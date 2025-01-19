class Solution {
     public static void main(String[] args) {
        int[] ar ={12,345,2,6,7896};
        int s=findNumbers(ar);
        System.out.println("total number of even numbers are : "+s);
        

    }
    static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            
            if(even(nums[i]))
            {
                count=count+1;
                
            }
        
        }
        return count;
    }
    private static boolean even(int i) {
        int numb=digits(i);
        if(i<0){
            i=i*-1;
        }
        if(numb%2==0){
            return true;
        }
        return false;
        
        
    }
    private static int digits(int i) {
        int n=i;
        int count1=0;
        while(n>0){
        n=n/10;
        count1=count1+1;
        }
        return count1;
        
    }
}