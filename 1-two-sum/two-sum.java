class Solution {
    public int[] twoSum(int[] arr, int target){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    int ans[] = {i,j};
                    return ans;
                }
            }
        }
      int ans[] = {-1,-1};
        return arr;                
    }    
}