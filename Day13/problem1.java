class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] a = new int[Math.min(nums1.length, nums2.length)];
        int c = 0;

        for(int i = 0; i < nums1.length; i++) {

            for(int j = 0; j < nums2.length; j++) {

                if(nums1[i] == nums2[j]) {

                    // duplicate check
                    boolean exists = false;

                    for(int k = 0; k < c; k++) {
                        if(a[k] == nums1[i]) {
                            exists = true;
                            break;
                        }
                    }

                    // add only if not already present
                    if(!exists) {
                        a[c] = nums1[i];
                        c++;
                    }

                    break;
                }
            }
        }

        return Arrays.copyOf(a, c);
    }
}
