class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int j=0;
        int[] arr=new int[n+n];
       
        for(int i=0;i<2;i++){
            for(int k=0;k<nums.length;k++){
                arr[j]=nums[k];
                j++;
            }
        }
        
       return arr;
     
    }
}