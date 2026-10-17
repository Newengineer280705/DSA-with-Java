class Solution {
    public boolean isPowerOfTwo(int n) {
        //1)Approch
        // if(n<=0){
        //     return false;
        // }
        // while(n%2==0){
        //     n = n/2;
        // }
        // return n==1;

        //2)Approch(recursion)
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        return isPowerOfTwo(n/2);

        //3)Approch
        // return n > 0 && (n & (n - 1)) == 0;
    }
}