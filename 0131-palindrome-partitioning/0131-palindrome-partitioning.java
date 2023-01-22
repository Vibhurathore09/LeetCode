class Solution {
    public List<List<String>> partition(String s) {
        if(s == null || s.length() == 0) return new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        Partition(s, list,ans);
        return ans;
    }
    
    public static void Partition(String ques , List<String> list , List<List<String>> ans){
        if(ques.length() == 0){
            ans.add(new ArrayList<>(list));
            return; 
        }
        for(int cut = 1 ; cut <= ques.length(); cut++){
            String s1 = ques.substring(0,cut);
            if(!Palindrome(s1)){
                continue;
            }
            list.add(s1);
            Partition(ques.substring(cut), list , ans);
            list.remove(list.size()-1);
        }
    }
    public static boolean Palindrome(String str){
        for(int i = 0 , j = str.length()-1 ; i < j ; j-- , i++){
            if(str.charAt(i)!= str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}