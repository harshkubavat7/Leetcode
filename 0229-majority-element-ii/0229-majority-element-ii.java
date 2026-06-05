class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // int n=nums.length;
        // // if(n<2)
        // // {
        // //     return nums;
        // // }
        // int first=nums[0];
        // int second=nums[0];
        // int fc=0;
        // int sc=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(first==nums[i])
        //     {
        //         first=nums[i];
        //         fc++;
        //     }
        //     else if(second==nums[i])
        //     {
        //         second=nums[i];
        //         sc++;
        //     }
        //     else if(fc==0)
        //     {
        //         first=nums[i];
        //         fc++;
        //     }
        //     else if(sc==0)
        //     {
        //         second=nums[i];
        //         sc++;
        //     }
        //     else{
        //         fc--;
        //         sc--;
        //     }
        // }
        // // if(first==second) return first;
        // fc=sc=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(first==nums[i]) fc++;
        //     else if(second==nums[i]) sc++;

        // }
        // List<Integer> ans = new ArrayList<>();
        // if(fc>n/3) ans.add(first);
        // if(sc>n/3) ans.add(second);

        // return ans;

        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num : map.keySet()){
            if(map.get(num)>(nums.length/3)){
                list.add(num);
            }
        }

        return list;

}


}