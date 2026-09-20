1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> graph=new ArrayList<>();
4        List<Integer> list=new ArrayList<>();
5        for(int i=0;i<numCourses;i++){
6            graph.add(new ArrayList());
7        }
8
9        int[] indegree=new int[numCourses];
10        for(int[] pre:prerequisites){
11            graph.get(pre[1]).add(pre[0]);
12            indegree[pre[0]]++;
13        }
14        Queue<Integer> queue=new LinkedList<>();
15        for(int i=0;i<numCourses;i++){
16            if(indegree[i]==0) queue.offer(i);
17        }
18        int count=0;
19        while(!queue.isEmpty()){
20            int current=queue.poll();
21            count++;
22            list.add(current);
23            for(int next:graph.get(current)){
24                indegree[next]--;
25                if(indegree[next]==0) queue.offer(next);   
26            }
27        }
28
29        if(count==numCourses){
30            int[] ans=new int[list.size()];
31            for(int i=0;i<list.size();i++){
32                ans[i]=list.get(i);
33            }
34            return ans;
35        }
36        return new int[]{};
37        
38        
39    }
40}