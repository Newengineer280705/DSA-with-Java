class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int value : nums) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        for (int value : map.keySet()) {
            if (map.get(value) > nums.length / 2) {
                return value;
            }
        }
        return -1;

    }
}