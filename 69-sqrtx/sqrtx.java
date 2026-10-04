class Solution {
    public int mySqrt(int x) {
        int st=0,end=x;
        int ans =0;
        if(x==0){
            return 0;}
        if(x==1){
            return 1;}
        while(st<=end){
            int mid = st + (end-st)/2;
            if(mid==x/mid){
                return mid;}
            else if(mid>x/mid){
                end = mid-1;}
            else{
                ans = mid;
                st = st+1;}
        }
        return ans;   
    }
}