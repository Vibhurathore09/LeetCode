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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        hasPathSum(root , targetSum , ans , new ArrayList<>());
        return ans;
    }
    public List<List<Integer>> hasPathSum(TreeNode root , int targetSum , List<List<Integer>> ans , ArrayList<Integer> sol){
        if(root == null){
            return ans;
        }
        sol.add(root.val);
        if(root.left == null && root.right == null && targetSum - root.val == 0){
            ans.add(new ArrayList<Integer>(sol));
        }
        else{
            hasPathSum(root.left , targetSum-root.val , ans , sol);
            hasPathSum(root.right , targetSum - root.val , ans , sol);
        }
        sol.remove(sol.size()-1);
        return ans;
    }
}