1class Solution {
2    int[] dp;
3    public int combinationSum4(int[] nums, int target) {
4        dp=new int[target+1];
5        Arrays.fill(dp,-1);
6        dp[0]=1;
7        return(solve(nums,target));
8    }
9    public int solve(int[] nums,int target){
10        if(target==0){
11            return 1;
12        }
13        if(target<0){
14            return 0;
15        }
16        int count=0;
17        if(dp[target]!=-1){
18            return dp[target];
19        }
20        for(int i:nums){
21            count+=solve(nums,target-i);
22        }
23        dp[target]=count;
24        return count;
25    }
26}