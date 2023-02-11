
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        boolean flag = true;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int size = q.size();
            while(size --> 0){
                TreeNode curr = flag ? q.poll() : q.pollLast();
                l.add(curr.val);
                if(flag ){
                    if(curr.left != null){
                        q.offer(curr.left);
                    }if(curr.right != null){
                        q.offer(curr.right);
                    }
                }else{
                    if(curr.right!=null){
                        q.offerFirst(curr.right);   
                    }
                    if(curr.left != null){
                        q.offerFirst(curr.left);
                    }
                }
            }
            if (l.size() > 0) list.add(l);
            flag = !flag;
        }
        return list;
        
    }
}