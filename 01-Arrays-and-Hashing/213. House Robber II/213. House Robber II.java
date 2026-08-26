1class Solution {
2    public int rob(int[] nums) {
3        if (nums.length == 1) {
4            return nums[0];
5        }
6        else if(nums.length==2){
7            return Math.max(nums[0],nums[1]);
8        }
9
10        int n = nums.length;
11
12        // Case 1: Rob houses from 0 to n-2
13        int[] dp1 = new int[n];
14        dp1[0] = nums[0];
15        dp1[1] = Math.max(nums[0], nums[1]);
16
17        for (int i = 2; i < n - 1; i++) {
18            dp1[i] = Math.max(dp1[i - 2] + nums[i], dp1[i - 1]);
19        }
20
21        // Case 2: Rob houses from 1 to n-1
22        int[] dp2 = new int[n];
23        dp2[1] = nums[1];
24        dp2[2] = Math.max(nums[1], nums[2]);
25
26        for (int i = 3; i < n; i++) {
27            dp2[i] = Math.max(dp2[i - 2] + nums[i], dp2[i - 1]);
28        }
29
30        return Math.max(dp1[n - 2], dp2[n - 1]);
31    }
32}