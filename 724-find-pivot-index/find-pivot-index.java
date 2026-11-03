class Solution {
    public int pivotIndex(int[] nums) {
    //    //Bruteforce Approch(With OutPlacing)
    //    int n = nums.length;
    //    int leftSum[] = new int[n];
    //    int rigSum[] = new int[n];
    //    for(int i=0; i<n; i++){ 
    //     for(int j=i-1; j>=0; j--){
    //         leftSum[i] += nums[j];
    //     }
    //     for(int j=i+1; j<n; j++){
    //         rigSum[i] += nums[j];
    //     }
    //     if(leftSum[i] == rigSum[i]){
    //         return i;
    //     } }
    //    return -1;
    // }}

    //Bruteforce Approch(With inplaing)
       int n = nums.length;
       
       for(int i=0; i<n; i++){ 
        int lSum = 0;
        int rSum = 0;
        for(int j=i-1; j>=0; j--){
            lSum += nums[j];
        }
        for(int j=i+1; j<n; j++){
            rSum += nums[j];
        }
        if(lSum == rSum){
            return i;
        } }
       return -1;
    }
}