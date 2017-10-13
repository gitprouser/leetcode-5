public class Solution {
    public int numberOfPatterns(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }

        int[][] skip = new int[10][10];
        skip[1][3] = skip[3][1] = 2;
        skip[4][6] = skip[6][4] = 5;
        skip[7][9] = skip[9][7] = 8;
        skip[1][7] = skip[7][1] = 4;
        skip[2][8] = skip[8][2] = 5;
        skip[3][9] = skip[9][3] = 6;
        skip[1][9] = skip[9][1] = 5;
        skip[3][7] = skip[7][3] = 5;

        boolean[] mark = new boolean[10];
        int ret = 0;
        for (int i = m; i <= n; i++) {
            ret += dfs(i - 1, 1, skip, mark) * 4;
            ret += dfs(i - 1, 4, skip, mark) * 4;
            ret += dfs(i - 1, 5, skip, mark);
        }
        return ret;
    }

    private int dfs(int n, int curr, int[][] skip, boolean[] mark) {
        if (n == 0) {
            return 1;
        }
        mark[curr] = true;
        int ret = 0;
        for (int i = 1; i <= 9; i++) {
            if (!mark[i] && (skip[curr][i] == 0 || mark[skip[curr][i]])) {
                ret += dfs(n - 1, i, skip, mark);
            }
        }
        mark[curr] = false;
        return ret;
    }
}
