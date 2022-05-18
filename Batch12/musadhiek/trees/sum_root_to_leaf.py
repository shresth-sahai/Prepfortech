# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumNumbers(self, root: Optional[TreeNode]) -> int:
         
            
        return self.helper(root,ans=0)
    
    def helper(self,root,ans):
        if not root:
            return 0
        ans = ans*10 + root.val
        if not root.left and not root.right:
            return ans
        return self.helper(root.left,ans)+ self.helper(root.right,ans)
