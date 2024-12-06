class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> arr=new ArrayList<String>();
        int count=1;
        if(n==1){
          arr.add(0,"1");
          return arr;  
        }
        if(n==2){
            arr.add(0,"1");
            arr.add(1,"2");
            return arr;
        }
        
        arr.add(0,"1");
        arr.add(1,"2");
        int k=3;
        for(int i=2;i<n;i++){
            if(k%3==0 && k%5==0){
               arr.add(i,"FizzBuzz"); 
            }
            else if(k%3==0){
               arr.add(i,"Fizz"); 
            }
            else if(k%5==0){
               arr.add(i,"Buzz"); 
            }
            else{
                String a = String.valueOf(k);
                arr.add(i,a);
            }
            k++;
            count++;
        }
        return arr;
    }
}