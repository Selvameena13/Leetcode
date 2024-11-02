class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
               map.replace(nums[i],map.get(nums[i])+1); 
            }else{
                map.put(nums[i],1);
            }
        }
        int k=0;
        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            if(mp.getValue()==1){
             k=mp.getKey();
            }
        }
        return k;
    }
}