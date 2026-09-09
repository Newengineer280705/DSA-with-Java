class Solution {
    public int search(int[] nums, int tar) {
          int st=0, end = nums.length-1;
      while(st<=end){
            int mid = (st+end)/2;

            if(nums[mid]==tar){
                return mid;
            }
            else if(nums[mid]<tar){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
             
        }
         return -1;    
    }
    }
