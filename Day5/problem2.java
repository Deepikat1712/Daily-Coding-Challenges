class Solution {
    public int thirdMax(int[] nums) {
      Arrays.sort(nums);
      int max=nums[nums.length-1];
      int b=1;
      for(int i=nums.length - 2 ; i>=0 ; i--){
       
            if(nums[i] != max){
                max=nums[i];
                b++;
               if(b==3){
                return max;
               }   
        }
        
      }
  
     return(nums[nums.length-1]);
    
    }
}
