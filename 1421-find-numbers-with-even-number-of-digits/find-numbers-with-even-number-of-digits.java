class Solution {
    public int findNumbers(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int cnt = 0;
            while(arr[i] != 0){
               arr[i] = arr[i]/10;
               cnt++;
            }
            if(cnt%2 == 0){
                count++;
            }
        }
        return count;
    }
}