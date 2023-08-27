class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length() == 0) return true;
        int idx = 0;
        boolean ans = false;
   
        for(int i = 0; i < t.length(); i ++){
 
           
            if(t.charAt(i) == s.charAt(idx)){
                idx ++;
               
            }
            
             if(  idx == s.length()) {
                ans = true;
                break;
            }
        }

        return ans;
        
    }
}