class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int ans = 0;
        if (x < 0) {
            return false;
        }
        while(x>0){
            int rem = x%10;
            ans = (ans*10)+rem;
            x = x/10;
        }
        return ans==org;
    }
}