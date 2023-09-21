class Solution {
    public int search(int[] nums, int target) {
     Arrays.sort(nums);
      
      int first=0,last=nums.length-1;
      
      
     while(first<=last){
       int mid=(first+last)/2;
     if(nums[mid] < target){
       first=mid+1;
        
      }
      else if(nums[mid] > target){
        last=mid-1;
        
      }
      else if (nums[mid]==target){
        return mid;
      }

     }

    return -1;
    }
}