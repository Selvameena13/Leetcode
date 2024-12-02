class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
       String[] arr = sentence.split(" ");
       int k=1;
       int n=searchWord.length(); 
       for(int i=0;i<arr.length;i++){
        if(arr[i].startsWith(searchWord)){
            return k;
        }
           k++;
       } 
       return -1;
    }
}