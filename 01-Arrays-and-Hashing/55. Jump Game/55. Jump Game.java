1class Solution {
2    public boolean canJump(int[] nums) {
3        int n=nums.length;
4        if(n==1){
5            return true;
6        }
7        int maxJump=0;
8        for(int i=0;i<n-1;i++){
9            maxJump=Math.max(i+nums[i],maxJump);
10            if(maxJump>=n-1){
11                return true;
12            }
13            if(maxJump<=i){
14                return false;
15            }
16        }
17        return true;
18    }
19}