1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int[] arr=new int[amount+1];
4        Arrays.fill(arr,Integer.MAX_VALUE);
5        arr[0]=0;
6        for(int i=1;i<=amount;i++){
7            for(int coin:coins){
8                if(coin<=i && arr[i-coin]!=Integer.MAX_VALUE){
9                    arr[i]=Math.min(arr[i],1+arr[i-coin]);
10                }
11            }
12        }
13        if(arr[amount]==Integer.MAX_VALUE){
14            return -1;
15        }
16        return arr[amount];
17        
18    }
19}