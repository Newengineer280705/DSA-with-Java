import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            arr[i] = arr[i]*arr[i];
        }

        Arrays.sort(arr);
        // int max = arr[0];
        // for(int i=1; i<n; i++){
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        // }
        // int count[] = new int[max+1];

        // for(int i=0; i<n; i++){
        //     count[arr[i]]++;
        // }

        // int index =0;
        // for(int i=0; i<count.length; i++){
        //     while(count[i]>0){
        //         arr[index] = i;
        //         index++;
        //         count[i]--;
        //     }
        //}

        return arr;
    }
}
