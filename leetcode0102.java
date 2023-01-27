//102.Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

class Solution {
     public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> que = new ArrayDeque<>();
        que.add(root);
        while(que.size()!=0){
            int size = que.size();
            List<Integer> smallAns = new ArrayList<>();
            while(size-- > 0){
                TreeNode rem = que.poll();
                smallAns.add(rem.val);
                if(rem.left!=null) que.add(rem.left);
                if(rem.right!=null) que.add(rem.right);
            }
            ans.add(smallAns);
        }
        return ans;
    }
}
