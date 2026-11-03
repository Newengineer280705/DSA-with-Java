class Solution {
    public int pivotIndex(int[] nums) {
       int n = nums.length;
       int leftSum[] = new int[n];
       int rigSum[] = new int[n];
       for(int i=0; i<n; i++){
        
        for(int j=i-1; j>=0; j--){
            leftSum[i] += nums[j];
        }
        for(int j=i+1; j<n; j++){
            rigSum[i] += nums[j];
        }
        if(leftSum[i] == rigSum[i]){
            return i;
        } }
       return -1;
    }
}