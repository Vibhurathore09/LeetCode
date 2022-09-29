class Solution {
    
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        Lexico_Counting(list, 0 ,n);
        
          // list.remove(0);
        return list;
    }
    public  void Lexico_Counting(List<Integer> list , int curr ,int n){
        if(curr > n){
            return;
        }
        if(curr!= 0)
            list.add(curr);
        int i = 0;
        if(curr == 0){
            i = 1;

        }
        for(; i<= 9 ; i++){
            Lexico_Counting(list ,curr*10+i, n);
        }
    }
}