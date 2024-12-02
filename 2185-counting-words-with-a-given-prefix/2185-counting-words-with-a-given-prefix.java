class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=0;
        
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){
                n++;
            }
        }
        
        if(n != 0){
            return n;
        }
        return 0;
    }
    
}