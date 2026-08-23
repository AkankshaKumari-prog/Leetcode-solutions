1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        boolean[] dp=new boolean[s.length()+1];
4        dp[0]=true;
5        HashSet<String> set=new HashSet<>();
6        int maxLen=0;
7        for(String word:wordDict){
8            set.add(word);
9            maxLen=Math.max(maxLen,word.length());
10        }
11        
12        for(int i=1;i<=s.length();i++){
13            for(int j=i-1;j>=Math.max(0,i-maxLen);j--){
14                if(dp[j] && set.contains(s.substring(j,i))){
15                    dp[i]=true;
16                    break;
17                }
18            }
19        }
20        return dp[s.length()];
21
22
23
24        
25    }
26}