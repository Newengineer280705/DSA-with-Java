class Solution {
    public int pivotIndex(int[] nums) {
    //Bruteforce Approch(Wittout space)
    //    int n = nums.length;
    //    for(int i=0; i<n; i++){ 
    //     int lSum = 0;
    //     int rSum = 0;
    //     for(int j=i-1; j>=0; j--){
    //         lSum += nums[j];
    //     }
    //     for(int j=i+1; j<n; j++){
    //         rSum += nums[j];
    //     }
    //     if(lSum == rSum){
    //         return i;
    //     } }
    //    return -1;
    // }}

    //optimal Appproch
    //[rightSum = TotSum - leftSum - nums[i]]
    int TotSum = 0;
    int leftSum = 0;
    for(int val: nums){
        TotSum += val;
    }
    for(int i=0; i<nums.length; i++){
        int RightSum = TotSum - leftSum - nums[i];
        if(leftSum == RightSum){
            return i;
        }
        leftSum += nums[i];
    }
    return -1;
    }
}