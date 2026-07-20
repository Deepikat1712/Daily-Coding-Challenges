class Solution {
    public int minElement(int[] nums) {
        int temp=0;
        int[] d = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++)
        {
            int b = nums[i];
            int sum = 0;

            while(b>0){
            int rem = b%10;
            sum += rem;
            b = b/10;
            }

            d[i] = sum;

        }
        int min= d[0];
        for(int i=1 ; i<d.length ; i++){
            if(d[i]<min )
            {
                min=d[i];
            }
        }
        return min;
    }
}
