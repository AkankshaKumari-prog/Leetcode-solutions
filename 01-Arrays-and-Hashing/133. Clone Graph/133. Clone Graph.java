1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    private Map<Node, Node> map = new HashMap<>();
23    public Node cloneGraph(Node node) {
24        if(node == null) return null;
25        if(map.containsKey(node)){
26            return map.get(node);
27        }
28        Node nodeCopy = new Node(node.val);
29        map.put(node, nodeCopy);
30        for(Node neighbour : node.neighbors){
31            nodeCopy.neighbors.add(cloneGraph(neighbour));
32        }
33        return nodeCopy;
34    }
35}