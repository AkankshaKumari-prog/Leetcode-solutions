1class Solution {
2    public static int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        int complement=0;
5        for(int i=0;i<nums.length;i++){
6            complement=target-nums[i];
7            if(map.containsKey(complement)){
8                return new int[]{map.get(complement),i};
9            }
10            map.put(nums[i],i);
11
12        }
13        return new int[]{};
14    }
15}