1class Solution {
2    public int maxProfit(int[] prices) {
3        int cp=Integer.MAX_VALUE,profit=0,maxProfit=0;
4        for(int i=0;i<prices.length;i++){
5            if(prices[i]<cp){
6                cp=prices[i];
7            }
8            profit=prices[i]-cp;
9            if(profit>maxProfit){
10                maxProfit=profit;
11            }
12        }
13        return maxProfit;
14
15    }
16}