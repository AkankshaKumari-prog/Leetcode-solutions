1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] ans=new int[nums.length];
4        ans[0]=1;
5        int prod=1;
6        for(int i=1;i<nums.length;i++){
7            prod*=nums[i-1];
8            ans[i]=prod;
9        }
10        prod=1;
11        for(int i=nums.length-2;i>=0;i--){
12            prod*=nums[i+1];
13            ans[i]*=prod;
14        }
15        return ans;
16    }
17}