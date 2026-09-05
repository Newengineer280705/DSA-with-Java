class Solution {
    public int maximumWealth(int[][] arr) {

        int sum[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum[i] += arr[i][j];
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<sum.length; i++){
            if(sum[i]>max){
                max = sum[i];
            }
        }
        return max;
        
    }
}