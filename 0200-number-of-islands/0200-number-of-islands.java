class Solution {
    public int numIslands(char[][] grid) {
        //basic conditions always written for this type of question(mandatory).
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
      return 0;
    }

    int count = 0;

    for (int i = 0; i < grid.length; i++)
      for (int j = 0; j < grid[0].length; j++)
        if (grid[i][j] == '1') { //means find a island so apply dfs to island
          dfs(grid, i, j);
          count++;
        }

    return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        // this if conditon is for outer water body mandatory condition.
    if (i < 0 || i >= grid.length
        || j < 0 || j >= grid[0].length
        || grid[i][j] == '0') {
      return;
    }

    grid[i][j] = '0'; // Mark the cell as visited

    // Explore all four directions
    dfs(grid, i + 1, j);
    dfs(grid, i - 1, j);
    dfs(grid, i, j + 1);
    dfs(grid, i, j - 1);
  }
}