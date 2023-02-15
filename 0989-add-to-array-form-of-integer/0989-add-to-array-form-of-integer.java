class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int n = num.length;
        int curr = k;
        int i = n;
        while(--i >= 0 || curr > 0){
            if(i >= 0)
                curr += num[i];
            list.add(curr % 10);
            curr/= 10;
        }
        Collections.reverse(list);
        return list;
    }
}