class Solution {
    public int firstUniqChar(String s) {

        int ans = Integer.MAX_VALUE;

        for(char c = 'a'; c <= 'z'; c++){
            
            int idx = s.indexOf(c);
            if(idx != -1 && idx == s.lastIndexOf(c)){
                ans = Math.min(ans, idx);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
        
//********************************************************************** */
        // int[] count = new int[26];
        // for(int i = 0; i < s.length(); i++){
           
        //    count[s.charAt(i) - 'a'] ++;
        // }

        // for(int i = 0; i < s.length(); i++){

        //     if(count[s.charAt(i) - 'a'] == 1){
        //         return i;
        //     }
        // }
        // return -1;


//************************************************************************** */
       // beats 92.97% 
        // int[] count = new int[26];
        // char[] ch = s.toCharArray();
        // for(char c : ch){
            
        //   count[c - 'a'] ++;
        // }

        // int idx = 0;
        // for(int c : ch){
        //     if(count[c - 'a'] == 1){
        //         return idx;
        //     }
        //     idx ++;

        // }
        // return -1;

        
//**************************************************************************** */
    //    HashMap<Character, Integer> map = new HashMap<>();

    //       char[] ch = s.toCharArray();
    //    for(char c : ch){
    //        map.put(c, map.getOrDefault(c, 0) + 1);
    //    } 

    //     int idx = 0;
    //    for(char c: ch){
    //        if(map.get(c) == 1){
    //            return idx;
    //        }
    //        idx ++;
    //    }
    //    return -1;
    }
}