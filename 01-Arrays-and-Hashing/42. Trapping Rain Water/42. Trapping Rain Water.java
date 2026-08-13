1class Solution {
2    public int trap(int[] height) {
3        int[] leftmax=new int[height.length];
4        leftmax[0]=height[0];
5        for(int i=1;i<height.length;i++){
6            leftmax[i]=Math.max(leftmax[i-1],height[i]);
7        }
8
9        int[] rightmax=new int[height.length];
10        rightmax[height.length-1]=height[height.length-1];
11        for(int i=height.length-2;i>=0;i--){
12            rightmax[i]=Math.max(rightmax[i+1],height[i]);
13        }
14
15        int sum=0;
16        for(int i=0;i<height.length-1;i++){
17            sum+=Math.min(leftmax[i],rightmax[i])-height[i];
18        }
19        
20        return sum;
21
22        
23    }
24}