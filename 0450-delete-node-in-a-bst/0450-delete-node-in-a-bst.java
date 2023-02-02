/**
 * Definition for a binary tree node.
 *  
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
                return root;
            }

            if(root.val < key){
                root.right = deleteNode(root.right, key);
            }else if(root.val > key){
                root.left = deleteNode(root.left, key);
            }else{
                // 1 Child or 0 Child
                if(root.left == null){
                    return root.right;
                }
                else if( root.right == null){
                    return root.left;
                }else{
                    int min = min(root.right);
                    root.right =deleteNode(root.right, min);
                    root.val = min;
                }
            }


            return root;

        }
        
    public int min(TreeNode root){
            if(root == null){
                return Integer.MAX_VALUE;
            }
            int left = min(root.left);
            return Math.min(left , root.val);
        }
}