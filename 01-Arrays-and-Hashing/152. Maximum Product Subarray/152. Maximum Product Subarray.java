1class Solution {
2    public int maxProduct(int[] nums) {
3        int minProd=nums[0],maxProd=nums[0],tempMax,ans=nums[0];
4        for(int i=1;i<nums.length;i++){
5            tempMax=maxProd;
6            maxProd=Math.max(nums[i],Math.max(maxProd*nums[i],minProd*nums[i]));
7            minProd=Math.min(nums[i],Math.min(tempMax*nums[i],minProd*nums[i]));
8            ans=Math.max(ans,maxProd);
9        }
10        return ans;
11        
12    }
13}