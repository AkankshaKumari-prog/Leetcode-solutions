1// class Solution {
2//     public int[] twoSum(int[] numbers, int target) {
3//         HashMap<Integer,Integer> map=new HashMap<>();
4//         for(int i=0;i<numbers.length;i++){
5//             int complement=target-numbers[i];
6//             if(map.containsKey(complement)){
7//                 return new int[]{map.get(complement)+1,i+1};
8//             }
9//             map.put(numbers[i],i);
10//         }
11//         return new int[]{0};
12        
13//     }
14// }
15
16
17
18
19
20
21
22
23
24
25class Solution {
26    public int[] twoSum(int[] numbers, int target) {
27       int left=0;
28       int right=numbers.length-1;
29       while(left<right){
30           int sum=numbers[left]+numbers[right];
31           if(sum==target){
32               return new int[]{left+1,right+1};
33           }
34           else if(sum>target){
35            right--;
36           }
37           else{
38            left++;
39           }
40        }
41        return new int[]{0};
42    }
43}