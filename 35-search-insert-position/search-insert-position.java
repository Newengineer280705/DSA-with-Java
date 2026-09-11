class Solution {
    public int searchInsert(int[] arr, int tar) {
        int n = arr.length;
        int st = 0, end = n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==tar){
                return mid;
            }
            else if (arr[mid]<tar){
                st = mid+1;
            }
            else if(arr[mid]>tar)
                end = mid-1;
            }
        return st;
    }
      
}