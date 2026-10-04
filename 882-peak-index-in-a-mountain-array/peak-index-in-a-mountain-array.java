class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int st=1,end=n-2; //Mounttian array me peak kabhi frist ya Lat index ni hota
        while(st<=end){
            int mid = st+ (end-st)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){ //peak right side h
                st=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}