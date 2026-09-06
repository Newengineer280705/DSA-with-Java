class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int ans[] = new int[2*n];

        for(int i=0; i<n; i++){
            list.add(nums[i]);
        }
        for(int i=0; i<n; i++){
           list.add(nums[i]);
        }
        for(int i=0; i<ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
        
    }
}