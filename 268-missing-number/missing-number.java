class Solution {
    public int missingNumber(int[] nums) {
        // int xor=0;
        // for(int value: nums){
        //     xor = xor ^ value;
        // }
        // for(int i=0; i<=nums.length; i++){
        //     xor = xor ^ i;
        // }
        // return xor;

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        //System.out.println(set);

        for(int i=0; i<=nums.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}