// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/submissions/

class Solution {
    public void add(TreeNode root, Set<Integer> hs) {
        if(root == null) return;
        hs.add(root.val);
        add(root.left, hs);
        add(root.right, hs);
    }
    
    public boolean search(TreeNode root, Set<Integer> hs, int k) {
        if(root == null) return false;

        if(hs.contains(k - root.val) && (k - root.val) != root.val) return true;
            
        return search(root.left, hs, k) || search(root.right, hs, k);
    }
    
    public boolean findTarget(TreeNode root, int k) {
        if(root.left == null && root.right == null) return false;
        Set<Integer> hs = new HashSet<>();
        add(root, hs);
        System.out.println(hs);
        return search(root, hs, k);
    }
}
