1class Solution {
2    public int jump(int[] nums) {
3        if(nums.length==1){
4            return 0;
5        }
6
7        int coverage=0,lastJumpIndex=0,totalJumps=0;
8        int destination=nums.length-1;
9
10        for(int i=0;i<nums.length;i++){
11            coverage=Math.max(coverage,i+nums[i]);
12            if(lastJumpIndex==i){
13                lastJumpIndex=coverage;
14                totalJumps++;
15
16                if(coverage>=destination){
17                    return totalJumps;
18                }
19            }
20        }
21        return totalJumps;
22        
23    }
24}