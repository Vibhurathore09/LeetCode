class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        if(isSame(p1,p2) || isSame(p1,p3) || isSame(p1,p4) || isSame(p2,p3) || isSame(p2,p4) || isSame(p3,p4)){
            return false;
        }
        HashSet<Integer> map = new HashSet<>();
        map.add(dis(p1,p2));
        map.add(dis(p1,p3));
        map.add(dis(p1,p4));
        map.add(dis(p2,p3));
        map.add(dis(p2,p4));
        map.add(dis(p3,p4));
        return map.size()==2;
    }
    public int dis(int [] p1 , int [] p2){
        return (int)Math.pow(p1[0]-p2[0],2) + (int)Math.pow(p1[1]-p2[1],2);
    }
    public boolean isSame(int p1[] , int p2[]){
        return p1[0] == p2[0] && p2[1] == p1[1];
    }
    
}