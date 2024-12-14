class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
        int n=nums.length/3;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
               map.replace(nums[i],map.get(nums[i])+1); 
            }else{
                map.put(nums[i],1);
            }
        }
        int k=0;
        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            if(mp.getValue()>n){
               arr.add(k,mp.getKey());
                k++;
            }
        }
        return arr;
    }
}