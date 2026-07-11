1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int j=0;
4        for(int i=m;i<nums1.length;i++){
5            nums1[i]=nums2[j++];
6        }
7        Arrays.sort(nums1);
8    }
9}