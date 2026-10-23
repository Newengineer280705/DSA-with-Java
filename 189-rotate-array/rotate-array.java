class Solution {
    public void rotate(int[] nums, int k) {
        // int n = nums.length;
        // //brute+force approch
        // k = k%n;
        // while (k > 0) {
        //     int value = nums[nums.length - 1];
        //     for (int i = nums.length - 1; i > 0; i--) {
        //         nums[i] = nums[i - 1];
        //     }
        //     nums[0] = value;
        //     k--;
        // }}}


        //optomized approch
        //formula: arr[(i+k)%n] = arr[i];
        
        int n = nums.length;
        int temp[] = new int[n];
        for(int i=0; i<n; i++){
            temp[(i+k)%n] = nums[i];
        }
        for(int i=0; i<n; i++){
            nums[i] = temp[i];
        }
    }
}
