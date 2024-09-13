class Solution {
    public int searchInsert(int[] nums, int target) {
            
          boolean flag=false;
       int k=nums.length;
          for(int i=0;i<nums.length;i++){
                if(nums[i]==target){
                     k=i;
                    return k;
                }
                else if(nums[i]>target){
                    k=i;
                    return k;
                }
              
          }
      return k;
    }
}