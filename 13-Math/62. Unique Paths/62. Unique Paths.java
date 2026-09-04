1class Solution {
2    int m,n;
3    int[][] dp;
4    public int uniquePaths(int m, int n) {
5        this.m=m;
6        this.n=n;
7        dp=new int[m][n];
8        for(int[] row:dp){
9            Arrays.fill(row,-1);
10        }
11        return countPath(0,0);
12    }
13
14    public int countPath(int r,int c){
15        if(r==m-1 && c==n-1){
16            return 1;
17        }
18        if(dp[r][c]!=-1){
19            return dp[r][c];
20        }
21        int count=0;
22        if(r<m-1){
23            count+=countPath(r+1,c);
24        }
25        if(c<n-1){
26            count+=countPath(r,c+1);
27        }
28        dp[r][c]=count;
29        return count;
30        
31    }
32}