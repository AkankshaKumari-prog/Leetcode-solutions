1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> graph=new ArrayList<>();
4        for(int i=0;i<numCourses;i++){
5            graph.add(new ArrayList());
6        }
7
8        int[] indegree=new int[numCourses];
9        for(int[] pre:prerequisites){
10            graph.get(pre[1]).add(pre[0]);
11            indegree[pre[0]]++;
12        }
13        Queue<Integer> queue=new LinkedList<>();
14        for(int i=0;i<numCourses;i++){
15            if(indegree[i]==0) queue.offer(i);
16        }
17
18        int count=0;
19        while(!queue.isEmpty()){
20            int curr=queue.poll();
21            count++;
22            for(int next:graph.get(curr)){
23                indegree[next]--;
24                if(indegree[next]==0) queue.offer(next);
25            }
26        }
27
28        return count==numCourses;
29        
30    }
31}