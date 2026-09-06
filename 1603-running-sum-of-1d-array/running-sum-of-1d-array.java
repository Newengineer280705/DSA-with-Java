class Solution {
    public int[] runningSum(int[] nums) {
       // ArrayList<Integer> list = new ArrayList<>();
        int sum =0;
        int result[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
           result[i] = sum;
        }
        return result;       
    }
}