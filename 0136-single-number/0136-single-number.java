class Solution {
    public int singleNumber(int[] nums) {
        int k=0;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    nums[i]=0;
                    nums[j]=0;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                k=nums[i];
            }
        }
       return k; 
    }
}