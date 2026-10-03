class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
        ///////////////////////////////////////
        // HashSet<Integer> set = new HashSet<>();
        // for(int val: nums){
        //     set.add(val);
        // }
        // if(set.size() != nums.length){
        //     return true;
        // }
        // return false;
    }
}