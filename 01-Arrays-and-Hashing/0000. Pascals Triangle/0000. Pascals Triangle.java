1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> list =new ArrayList<>();
4        if(numRows==0){
5            return list;
6        }
7        list.add(Arrays.asList(1));
8        if(numRows==1){
9            return list;
10        }
11
12        for(int i=1;i<numRows;i++){
13            List<Integer> prevRow=list.get(i-1);
14            List<Integer> currRow=new ArrayList<>();
15            currRow.add(1);
16            for(int j=1;j<i;j++){
17                currRow.add(prevRow.get(j)+prevRow.get(j-1));
18            }
19            currRow.add(1);
20            list.add(currRow);
21        }
22        return list;
23
24        
25    }
26    
27}