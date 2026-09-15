class Solution {
    public int majorityElement(int[] nums) {

        //bruteforce approch (n)2
    //     for(int i=0; i<nums.length; i++){
    //         int frq=0;
    //         for(int j=0; j<nums.length; j++){
    //             if(nums[j]==nums[i]){
    //                 frq++;
    //             }
    //         }
    //         if(frq>nums.length/2){
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }}


    //optomize btureforce (nlogn)
//     Arrays.sort(nums);

//     int frq=1, ans = nums[0];
//     for(int i=1; i<nums.length; i++){
//         if(nums[i] == nums[i-1]){
//             frq++;
//         }
//         else{
//             frq=1;
//             ans = nums[i];
//         }

//         if(frq >nums.length/2 ){
//             return ans;
//         }
//     }
//     return ans;
//     }
// }
    
        //Hashmap approch (n)
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int value : nums) {
        //     map.put(value, map.getOrDefault(value, 0) + 1);
        // }
        // for (int value : map.keySet()) {
        //     if (map.get(value) > nums.length / 2) {
        //         return value;
        //     }
        // }
        // return -1;

        //Boyer-Moore Algorithn (n)
        int frq=0, ans=0;
        for(int i=0; i<nums.length; i++){
            if(frq == 0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                frq++;
            }
            else{
                frq--;
            }
        }
        return ans;
    }
}