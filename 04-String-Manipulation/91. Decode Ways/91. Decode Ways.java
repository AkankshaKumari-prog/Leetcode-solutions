class Solution {
    public int numDecodings(String s) {
        dp = new int[s.length() + 1];
        Arrays.fill(dp, -1);
        str = s;
        return countWaysToDecode(0);
    }

    private int[] dp;
    private String str;

    private int countWaysToDecode(int i) {
        // System.out.println(i);
        if (dp[i] > -1) {
            return dp[i];
        }
        if (i == str.length()) {
            return 1;
        }
        int first = str.charAt(i) - '0';
        if (first == 0) {
            return dp[i] = 0;
        }
        int res = countWaysToDecode(i + 1);
        if (i + 1 < str.length()) {
            int second = str.charAt(i+1) - '0';
            int doubleDigits = first * 10 + second;
            if (doubleDigits >= 10 && doubleDigits <= 26) {
                res += countWaysToDecode(i + 2);
            }
        }
        return dp[i] = res;
    }
}