1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5             if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k){
6                return true;
7            }
8            map.put(nums[i],i);
9        }
10        return false;
11
12        
13    }
14}