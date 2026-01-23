/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
      private static final String spliter = ",";
    private static final String NN = "X";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

       StringBuilder sb=new StringBuilder();
        helper(root,sb);
        return sb.toString();

        
    }
    private void helper(TreeNode root, StringBuilder str){
        if(root==null){
            str.append(NN).append(spliter);
        }
      else{
        str.append(root.val).append(spliter);
         helper( root.left, str);
          helper(root.right, str);

      }


    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
           
 Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(spliter)));
        return buildTree(nodes);

        
    }
     private TreeNode buildTree(Deque<String> nodes) {
        String val = nodes.remove();
        if (val.equals(NN)) return null;
        else {
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }


}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));