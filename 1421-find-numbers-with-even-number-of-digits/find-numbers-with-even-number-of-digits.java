class Solution {
    public int findNumbers(int[] arr) {
        int count = 0;
        for(int val: arr){
            int cnt = 0;
            while(val != 0){
               val = val/10;
               cnt++;
            }
            if(cnt%2 == 0){
                count++;
            }
        }
        return count;
    }
}