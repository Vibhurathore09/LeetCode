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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        pathSum(root, sum, new ArrayList<Integer>(), res);
        return res;
    }
    public List<List<Integer>> pathSum(TreeNode root , int sum , ArrayList<Integer> a , List<List<Integer>> res){
        if(root == null){
            return res;
        }
        a.add(root.val);
        if(root.left == null && root.right == null && sum-root.val == 0){
            res.add( new ArrayList<Integer>(a));
        }else{
            pathSum(root.left , sum-root.val , a , res);
            pathSum(root.right , sum-root.val , a , res);
        }
        a.remove(a.size()-1);
        return res;
    }
}