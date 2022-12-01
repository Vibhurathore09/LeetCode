class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
         Deque<Integer> dq = new LinkedList<>();
        int [] ans = new int[a.length-k+1];
        int j = 1;
        for(int i = 0 ; i < k ; i++){
            while(!dq.isEmpty() && a[i] > a[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i); //add last

        }
        ans[0] = a[dq.getFirst()];
        for(int i = k ; i < a.length ; i++){
            while(!dq.isEmpty() && a[i] > a[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i);
            if(!dq.isEmpty() && dq.getFirst() == i-k){
                dq.removeFirst();
            }
            ans[j] = a[dq.getFirst()];
            j++;
        }
        return ans;
    }
}