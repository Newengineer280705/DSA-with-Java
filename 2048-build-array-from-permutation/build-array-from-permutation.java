class Solution {
    public int[] buildArray(int[] num) {
        int n = num.length;
        int ans[] = new int[n];

        for(int i=0; i<n; i++){
            ans[i] = num[num[i]];
        }
        return ans;
        
    }
}