

// User function Template for Java

/*
    class Node{
        int val;
        ArrayList<Node> neighbors;
        public Node(){
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int val){
            this.val = val;
            neighbors = new ArrayList<>();
        }

        public Node(int val, ArrayList<Node> neighbors){
            this.val = val;
            this.neighbors = neighbors;
        }
    }
*/
class Solution {
    Node cloneGraph(Node node) {
        // code here
          Map<Integer,Node> map=new HashMap<>();
        return dfs(node,map);
    }
    public Node dfs(Node node,Map<Integer,Node> map){
        if(!map.containsKey(node.val)){
            ArrayList<Node> neighbors=new ArrayList<>();
            Node temp=new Node(node.val,neighbors);
            map.put(node.val,temp);
            for(Node v:node.neighbors){
                neighbors.add(dfs(v,map));
            }
            return temp;
        }
        return map.get(node.val);
    }
}
