1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> set =new HashSet<>();
4        for(int i:nums){
5            if(set.contains(i)){
6                return true;
7            }
8            set.add(i);
9        }
10        return false;    
11    }
12}