class Solution {
    public int search(int[] arr, int tar) {
    /* int n= arr.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid]==tar){
                return mid;
            }
            else if(arr[st]<=arr[mid]){ //left sorted
                   if(arr[st]<= tar && tar<=arr[mid]){
                    end = mid-1;
                   }
                   else{
                    st = mid+1;
                   }
            }
            else{  //right sorted
                if(arr[mid]<=tar && tar<=arr[end]){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
        */
        int count = 0;
        for(int i=0;i<arr.length ;i++){
            if(arr[i] == tar){
                count = i;
                break;
            }
            else{
                count = -1;
            }
        }
        return count;
    }
    }