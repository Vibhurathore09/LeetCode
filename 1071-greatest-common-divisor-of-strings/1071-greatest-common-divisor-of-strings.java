class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length() , len2 = str2.length();
        for( int i = Math.min(len1 , len2)  ; i >= 1 ; i--){ //Look for shorted string between str1 and str2 and start looking for gcd form back of string.
             if(valid(str1 , str2 , i)){
                return str1.substring(0,i);
            }
        }
        return "";
    }
    public boolean valid(String str1 , String str2, int k){
        int len1 = str1.length() , len2 = str2.length();
        if(len1 %k > 0 || len2 %k > 0){  // if k is not fully divisible by len of string then it cannot be gcd at all .
            return false;
        }else{
            String base = str1.substring(0,k);
            return str1.replace(base,"").isEmpty() && str2.replace(base , "").isEmpty();
            // if base is replaced with all the character in both string then it will be empty and it will return true
        }
        
    }
}