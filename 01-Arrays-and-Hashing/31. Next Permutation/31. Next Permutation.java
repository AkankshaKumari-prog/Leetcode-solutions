1class Solution {
2    public void nextPermutation(int[] nums) {
3        int i=nums.length-2;
4        while(i>=0 && nums[i]>=nums[i+1]){
5            i--;
6        }
7        int j=nums.length-1;
8        while(i>=0 && nums[j]<=nums[i]){
9            j--;
10        }
11        if(i>=0){
12            int temp=nums[i];
13            nums[i]=nums[j];
14            nums[j]=temp;
15        }
16        reverse(nums,i+1,nums.length-1);
17        
18    }
19    public void reverse(int[] nums,int left,int right){
20        while(left<right){
21            int temp=nums[left];
22            nums[left]=nums[right];
23            nums[right]=temp;
24            left++;
25            right--;
26        }
27    }
28}