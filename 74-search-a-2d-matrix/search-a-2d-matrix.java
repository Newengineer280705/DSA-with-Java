class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        //linear search
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //        if(arr[i][j] == target) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        int totalRow = mat.length;
        int totalCol = mat[0].length;
        int n = totalRow*totalCol;

        int st =0;
        int end = n-1;   
        while(st<=end){
            int mid = st + (end-st)/2;
            int rowIdx = mid/totalCol;
            int colIdx = mid%totalCol;
            if(mat[rowIdx][colIdx]==target){
                return true;
            }
            else if(mat[rowIdx][colIdx]<target){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
    return false;
    }
}