// https://leetcode.com/problems/binary-tree-preorder-traversal/

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        if(root == null) return new ArrayList<>();
        
        list.add(root.val);
        
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        
        return list;
    }
}

// https://leetcode.com/problems/binary-tree-inorder-traversal/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        if(root == null) return list;
        
        list.addAll(inorderTraversal(root.left));
        
        list.add(root.val);
        
        list.addAll(inorderTraversal(root.right));

        return list;
    }
}

//https://leetcode.com/problems/binary-tree-postorder-traversal/
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }
}
