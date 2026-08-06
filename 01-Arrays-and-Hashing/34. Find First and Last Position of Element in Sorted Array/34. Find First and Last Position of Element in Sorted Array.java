1class Solution {
2    int potLeft=-1,potRight=-1;
3    public int[] searchRange(int[] nums, int target) {
4        int first=binarySearchLeft(nums,0,nums.length-1,target);
5        int second=-1;
6        if(first!=-1){
7            second=binarySearchRight(nums,first,nums.length-1,target);
8        }
9        return new int[]{first,second};
10
11    }
12    public int binarySearchLeft(int[] nums,int start,int end,int target){
13        if(start>end){
14            return potLeft;
15        }
16        int mid=start+(end-start)/2;
17        if(nums[mid]==target){
18            potLeft=mid;
19            return binarySearchLeft(nums,start,mid-1,target);
20        }
21        else if(nums[mid]<target){
22            return binarySearchLeft(nums,mid+1,end,target);
23
24        }
25        else{
26            return binarySearchLeft(nums,start,mid-1,target);
27
28        }
29
30    }
31    public int binarySearchRight(int[] nums,int start,int end,int target){
32        if(start>end){
33            return potRight;
34        }
35        int mid=start+(end-start)/2;
36        if(nums[mid]==target){
37            potRight=mid;
38            return binarySearchRight(nums,mid+1,end,target);
39        }
40        else if(nums[mid]<target){
41            return binarySearchRight(nums,mid+1,end,target);
42
43        }
44        else{
45            return binarySearchRight(nums,start,mid-1,target);
46
47        }
48
49    }
50}