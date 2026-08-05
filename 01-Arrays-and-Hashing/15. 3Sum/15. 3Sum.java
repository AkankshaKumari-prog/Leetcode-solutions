1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> list=new ArrayList<>();
4        Arrays.sort(nums);
5        for(int i=0;i<nums.length-2;i++){
6            if(i!=0 && nums[i]==nums[i-1]){
7                continue;
8            }
9            int first=nums[i];
10            int left=i+1;
11            int right=nums.length-1;
12            while(left<right ){
13                int target=-first;
14                int sum=nums[left]+nums[right];
15                if(sum==target){
16                    list.add(Arrays.asList(first,nums[left],nums[right]));
17                    left++;
18                    right--;
19                
20                    while(left<right && nums[left]==nums[left-1]){
21                        left++;
22                    }
23                    while(left<right && nums[right]==nums[right+1]){
24                        right--;
25                    }
26                }
27                else if(sum<target){
28                    left++;
29                }
30                else{
31                    right--;
32                }
33            }
34        }
35        return list;
36        
37
38
39        
40    }
41}