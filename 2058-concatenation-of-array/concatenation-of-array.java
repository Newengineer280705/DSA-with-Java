class Solution {
    public int[] getConcatenation(int[] nums) {
    //  """ int ans[] = new int[2*nums.length];
    //    for(int i=0; i<ans.length; i++){
    //     if(i>=nums.length){
    //         ans[i] = nums[i-nums.length];
    //     }
    //     else{
    //         ans[i] = nums[i];
    //     }
    // }
    // return ans;"""
    List<Integer> arr = new ArrayList<>();

    for(int val : nums){
        arr.add(val);
    }
    for(int val : nums){
        arr.add(val);
    }
    int ans[] = new int[arr.size()];
    for(int i=0; i<arr.size(); i++){
        ans[i] = arr.get(i);
    }
    return ans;

    }
} 
