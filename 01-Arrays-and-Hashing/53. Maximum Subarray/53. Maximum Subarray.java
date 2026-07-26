1class Solution {
2    public int maxSubArray(int[] nums) {
3        int sum=nums[0],maxSum=nums[0];
4        for(int i=1;i<nums.length;i++){
5            sum+=nums[i];
6            if(nums[i]>sum){
7                sum=nums[i];
8            }
9            if(sum>maxSum){
10                maxSum=sum;
11            }
12        }
13        return maxSum;
14        
15    }
16}