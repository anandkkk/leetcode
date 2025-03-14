class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int z = x;
        int reverse = 0;
        while(z > 0){
            reverse = z%10 + reverse*10;;
            z = z/10;
        }
        return x == reverse;
        
    }
}
