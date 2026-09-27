class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        int mid = n;
        int st = 0;
        int st2 = mid;
        int i =0;
        while(st<n){

            if(st<mid){
                ans[i] = nums[st];
                i++;
                st++;
            }
            if(st2<2*n){
                ans[i] = nums[st2];
                i++;
                st2++;
            }
        }
        return ans;
    }
}