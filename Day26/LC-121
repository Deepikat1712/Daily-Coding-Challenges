class Solution {
    public int maxProfit(int[] a) {
        int max=0;
        for(int i=0 ; i<a.length ; i++){
            for(int j=i+1 ; j<a.length ; j++){
                int b=a[j]-a[i];
                if(b>max){
                    max=b;
                }
            }

        }
        return max;
    }
}
