1class Solution {
2    public int search(int[] nums, int target) {
3        return binarySearch(0, nums.length - 1, target, nums);
4    }
5
6    public int binarySearch(int start, int end, int target, int[] nums) {
7
8        if (start > end)
9            return -1;
10
11        int mid = start + (end - start) / 2;
12
13        if (nums[mid] == target)
14            return mid;
15
16        // Left half is sorted
17        if (nums[start] <= nums[mid]) {
18
19            if (target >= nums[start] && target < nums[mid]) {
20                return binarySearch(start, mid - 1, target, nums);
21            } else {
22                return binarySearch(mid + 1, end, target, nums);
23            }
24        }
25
26        // Right half is sorted
27        else {
28
29            if (target > nums[mid] && target <= nums[end]) {
30                return binarySearch(mid + 1, end, target, nums);
31            } else {
32                return binarySearch(start, mid - 1, target, nums);
33            }
34        }
35    }
36}