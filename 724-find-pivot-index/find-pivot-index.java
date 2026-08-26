class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum1 = 0, sum2 = 0;
            for (int j = i + 1; j < n; j++) {
                sum1 += nums[j];
            }
            for (int k = i - 1; k >= 0; k--) {
                sum2 += nums[k];
            }
            if (sum1 == sum2) {
                return i;
            }
        }
        return -1;

    }
}