class Solution {
    public int[] twoSum(int[] nums, int target){
    //Bruteforce Approch
    //     for(int i=0; i<arr.length-1; i++){
    //         for(int j=i+1; j<arr.length; j++){
    //             if(arr[i]+arr[j]==target){
    //                 int ans[] = {i,j};
    //                 return ans;
    //             }
    //         }
    //     }
    //     int ans[] = {-1,-1};
    //     return arr;                
    // }  }


    //Optimal Appproch
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0; i<nums.length ; i++){
        int comp = target - nums[i];
        if(map.containsKey(comp)){
            return new int[]{map.get(comp),i};
        }
        map.put(nums[i],i);
    }
    return new int[]{};
    }}