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
    ArrayList<Integer> leaf1 = new ArrayList<>();
    ArrayList<Integer> leaf2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        leaf1 = leaf(root1 , leaf1);
        leaf2 = leaf(root2 , leaf2);
        return leaf1.equals(leaf2);
    }
    public ArrayList<Integer> leaf(TreeNode root , ArrayList<Integer> list){
        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        leaf(root.left , list);
        leaf(root.right , list);
        return list;
    }
    
}