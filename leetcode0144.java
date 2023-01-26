//144.Given the root of a binary tree, return the preorder traversal of its nodes' values.

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        if(root==null){
            return res;
        }
        res.add(root.val);
        res.addAll(preorderTraversal(root.left));
        res.addAll(preorderTraversal(root.right));
        
        return res;
    }
    
}

//note-->Here we use the .addAll() so that the resulting list can be added to the original list i.e., "res".
