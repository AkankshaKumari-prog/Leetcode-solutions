1class Solution {
2    public int longestConsecutive(int[] nums) {
3        if(nums.length==0) return 0;
4        Arrays.sort(nums);
5        int longest=1;int count=1;
6        for(int i=0;i<nums.length-1;i++){
7            if(nums[i]==nums[i+1]) continue;
8            if(nums[i]+1==nums[i+1]) count++;
9            else{
10                longest=Math.max(longest,count);
11                count=1;
12            }
13        }
14        longest=Math.max(longest,count);
15        return longest;
16        
17    }
18}