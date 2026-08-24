class Solution {
    public int removeDuplicates(int[] arr) {
      int i=0, j=i, n= arr.length;

      while(j<n){
        if(arr[i]==arr[j]){
            j++;
        }
        else{
            i++;
            arr[i] = arr[j];
            j++;             
      }   
    }
     return i+1;
    }
}
