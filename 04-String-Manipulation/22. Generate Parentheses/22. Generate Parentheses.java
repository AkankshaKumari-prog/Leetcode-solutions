1class Solution {
2    int n;
3    public List<String> generateParenthesis(int n) {
4        this.n=n;
5        generate(,0,0);
6        return list;
7        
8
9    }
10    List<String> list=new ArrayList<>();
11    public void generate(String str,int open,int close){
12        if(open==n && close==n){
13            list.add(str);
14        }
15        if(open<n){
16            generate(str+(,open+1,close);
17        }
18        if(close<open){
19            generate(str+),open,close+1);
20        }
21    }
22}