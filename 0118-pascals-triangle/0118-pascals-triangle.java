class Solution {
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> result = new ArrayList<>();
        if(num==0) return result;
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        result.add(firstrow);
        if(num==1) return result;

        for(int i=1;i<num;i++)
        {
            List<Integer> prev = result.get(i-1);

            ArrayList row = new ArrayList<>();

            row.add(1);
            for(int j=0;j<i-1;j++)
            {
                row.add(prev.get(j)+prev.get(j+1));

            }
            row.add(1);

            result.add(row);


        }
        return result;

    }
}