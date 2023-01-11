class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
//         In this we have checked if distance of any side is 0 , i.e. Same , if distance is same then square cannot be formed
        if(isSame(p1,p2) || isSame(p1,p3) || isSame(p1,p4) || isSame(p2,p3) || isSame(p2,p4) || isSame(p3,p4)){
            return false;
        }
        HashSet<Integer> map = new HashSet<>();
//      In this we are Calculating distance of all the 4 sides of a square and two diagonals
        map.add(dis(p1,p2));
        map.add(dis(p1,p3));
        map.add(dis(p1,p4));
        map.add(dis(p2,p3));
        map.add(dis(p2,p4));
        map.add(dis(p3,p4));
//      In sq all four sides are equal and both the diagonals are equals , so the size of set should be 2
        return map.size()==2;
    }
//     Calculating distance
    public int dis(int [] p1 , int [] p2){
        return (int)Math.pow(p1[0]-p2[0],2) + (int)Math.pow(p1[1]-p2[1],2);
    }
//     Checking if the points are same or not
    public boolean isSame(int p1[] , int p2[]){
        return p1[0] == p2[0] && p2[1] == p1[1];
    }
    
}