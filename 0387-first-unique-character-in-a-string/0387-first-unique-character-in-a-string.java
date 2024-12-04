class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
        
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
              map.replace(s.charAt(i),map.get(s.charAt(i))+1);  
            }else{
                map.put(s.charAt(i),1);
            }
        }
        
        char ch=' ';
        
        for(Map.Entry<Character,Integer> mp:map.entrySet()){
            if(mp.getValue()==1){
               ch=mp.getKey();
                break;
            }
           
        }
        
        for(int i=0;i<s.length();i++){
            if(ch==s.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}