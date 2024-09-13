class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m+n;
        int[] arr=new int[k];
        
        int a=0;
        for(int i=0;i<k;i++){
          if(nums1[i] != 0){
              arr[a]=nums1[i];
              a++;
          }
        nums1[i]=0;
        }
        for(int j=0;j<n;j++){
            arr[a]=nums2[j];
            a++;
        }
       for(int i=0;i<k;i++){
           nums1[i]=arr[i];
       }
        Arrays.sort(nums1);
    }
}