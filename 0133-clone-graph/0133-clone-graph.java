/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {

        if(node==null){
            return null;
        }
        HashMap<Node,Node> map=new HashMap<>();
        dfs(node,map);

        return map.get(node);

        
    }

    public void dfs(Node node, HashMap<Node,Node> mapNew){
         
         if(mapNew.containsKey(node)){
            return;
         }
         mapNew.put(node,new Node(node.val));

         for(Node nod: node.neighbors ){
          dfs(nod,mapNew);
          mapNew.get(node).neighbors.add(mapNew.get(nod));

         }


    }

}