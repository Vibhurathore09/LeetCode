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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = true; // Take flag for reverseing the list;
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            while (size-- > 0) {
                TreeNode t = flag ? q.poll() : q.pollLast();
                l.add(t.val);
                if (flag) {
                    if (t.left != null) q.offer(t.left);
                    if (t.right != null) q.offer(t.right);
                } else {
                    if (t.right != null) q.offerFirst(t.right);
                    if (t.left != null) q.offerFirst(t.left);
                }
            }
            if (l.size() > 0) result.add(l);
            flag = !flag;
        }
        return result;
    }
}