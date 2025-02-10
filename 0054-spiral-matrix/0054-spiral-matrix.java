class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int rowbegin=0;
        int rowend=arr.length-1;
        int colbegin=0;
        int colend=arr[0].length-1;
        List<Integer> list = new ArrayList<>();
        while(rowbegin<=rowend && colbegin<=colend)
        {
            for(int i=colbegin;i<=colend;i++)
            {
                list.add(arr[rowbegin][i]);
            }
            rowbegin++;

            for(int i=rowbegin;i<=rowend;i++)
            {
                list.add(arr[i][colend]);

            }
            colend--;

            if(rowbegin<=rowend){
                for(int i=colend;i>=colbegin;i--)
                {
                    list.add(arr[rowend][i]);
                }
            }
            rowend--;

            if(colbegin<=colend){
                for(int i=rowend;i>=rowbegin;i--)
                {
                    list.add(arr[i][colbegin]);
                }
            }
            colbegin++;
        }
        return list;

    }
}