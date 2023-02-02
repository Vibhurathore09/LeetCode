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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        if(root == null){
            return -1;
        }
        int max = Integer.MIN_VALUE ,idx = 0;
        int level = 0;
        while(q.isEmpty() == false){
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            level++;
            int sum = 0;
            while(size-->0){
                TreeNode curr = q.poll();
                l.add(curr.val);
                sum += curr.val;
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            if(max < sum){
                max = sum;
                idx =level; 
            }
            
        }
        return idx;   
    }
}