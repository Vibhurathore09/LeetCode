/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {} 
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root){
        if(Balance(root) >= 0){
            return true;
        }else{
            return false;
        }
    }
    public int Balance(TreeNode root){
        if(root == null){   // if root == null , return height 0
            return 0;
        }
        int lh = Balance(root.left) ;
        if(lh == -1){    // if lh is unbalanced return -1
            return -1;
        }
        int rh = Balance(root.right);
        if(rh == -1){    // if rh is unbalnaced return -1
            return -1;
        }
        if(Math.abs(lh-rh) > 1){   // if height of right and left subtree is more than 1 return -1
            return -1;
        }else{        // returning the height of the subtree
            return Math.max(lh , rh )+1;
        }
    }
}