class TimeMap {
 HashMap<String, ArrayList<String>> map = new HashMap<>();
 
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
       
        
        
       if(map.containsKey(key)){
           ArrayList<String> s1 = map.get(key);
           s1.add(value);
           s1.add(Integer.toString(timestamp));
           map.put(key, s1);
       }
       else{
           ArrayList<String> s = new ArrayList<>();
          s.add(value);
          s.add(Integer.toString(timestamp));
           map.put(key, s);
       }

    
    }
    
    public String get(String key, int timestamp) {
        ArrayList<String> s2 = map.get(key);
        String ans = "";
        if(s2 != null){
        int l = s2.size();
        
        for(int i = l-1; i>=0; i--){
            if(Integer.parseInt(s2.get(i)) <= timestamp){
                ans = s2.get(i-1);
                return ans;
            }
            i--;
        }
       
        }
         return ans;

    }
    
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */