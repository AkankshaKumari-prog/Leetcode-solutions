1class Solution {
2    public int rob(int[] nums) {
3        if(nums.length==1){
4            return nums[0];
5        }
6        else if(nums.length==2){
7            return(Math.max(nums[0],nums[1]));
8        }
9        int[] dp=new int[nums.length];
10        dp[0]=nums[0];
11        dp[1]=Math.max(nums[0],nums[1]);
12        
13        for(int i=2;i<dp.length;i++){
14            dp[i]=Math.max((dp[i-2]+nums[i]),dp[i-1]);
15        }
16        return dp[dp.length-1];
17
18
19        
20    }
21}