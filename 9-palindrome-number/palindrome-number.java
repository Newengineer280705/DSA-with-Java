class Solution {
    public boolean isPalindrome(int x) {
        int org=x,ans=0;
        if(x<0){
            return false;
        }
        while(x>0){
            ans = ans*10 + x%10;
            x = x/10;
        }
        return (org==ans);
    }
}